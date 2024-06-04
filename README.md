## Part 1. Getting metrics and logs

### Use the Micrometer library to write the following application metrics collectors:
 - number of messages sent to rabbitmq; 
 - number of messages processed in rabbitmq; 
 - number of bookings; 
 - number of requests received at the gateway; 
 - number of user authorization requests received.

##### Added all dependencies for creating and getting custom metrics
![1.1](./images/part_1/1.1.png)
##### An example of how I created custom metrics using the micrometer library
![1.2](./images/part_1/1.2.png)
> all other custom metrics can be found in the service directories/src
##### Custom metric before - get request 
![1.3](./images/part_1/1.3.png)
##### Custom metric after - get request 
![1.4](./images/part_1/1.4.png)
![1.5](./images/part_1/1.5.png)
> etc... 

### Add application logs using Loki.
![1.6](./images/part_1/1.6.png)
![1.7](./images/part_1/1.7.png)