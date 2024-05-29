package com.s21.devops.sample.bookingservice.Statistics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.s21.devops.sample.bookingservice.Communication.BookingStatisticsMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class QueueProducer {
    @Value("${fanout.exchange}")
    private String fanoutExchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    Counter visitCounter;

    public QueueProducer(MeterRegistry registry) {
      visitCounter = Counter.builder("visit_counter")
        .description("Number of visits to the site")
        .register(registry);
    }
    private ObjectMapper objectMapper = new ObjectMapper();

    public void putStatistics(BookingStatisticsMessage bookingStatisticsMessage) throws JsonProcessingException {
        System.out.println("Sending message...");
        rabbitTemplate.setExchange(fanoutExchange);
        rabbitTemplate.convertAndSend(objectMapper.writeValueAsString(bookingStatisticsMessage));
        System.out.println("Message was sent successfully!");
	visitCounter.increment();
    }
}
