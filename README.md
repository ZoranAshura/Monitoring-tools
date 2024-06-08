## Part 1. Getting metrics and logs

### Use the Micrometer library to write the following application metrics collectors:
 - number of messages sent to rabbitmq; 
 - number of messages processed in rabbitmq; 
 - number of bookings; 
 - number of requests received at the gateway; 
 - number of user authorization requests received.

#### Added all dependencies for creating and getting custom metrics
![1.1](./images/part_1/1.1.png)
#### An example of how I created custom metrics using the micrometer library
![1.2](./images/part_1/1.2.png)
> all other custom metrics can be found in the service directories/src
#### Custom metric before - get request 
![1.3](./images/part_1/1.3.png)
#### Custom metric after - get request 
![1.4](./images/part_1/1.4.png)
![1.5](./images/part_1/1.5.png)
> etc... 

### Add application logs using Loki.
![1.6](./images/part_1/1.6.png)
![1.7](./images/part_1/1.7.png)

### Create a new stack for the docker swarm of services with Prometheus Server, Loki, node_exporter, blackbox_exporter, cAdvisor.
> You can find the docker compose file for this stack in the ./docker-stacks/ directory 

#### Two stacks have been created 
![1.8](./images/part_1/1.8.png)
![1.9](./images/part_1/1.9.png)


### Check receiving metrics on port 9090 via a browser.
![1.8](./images/part_1/1.10.png)

## Part 2. Visualization
### Add a dashboard with the following metrics to grafana:
-   number of nodes;
-   number of containers;
-   number of stacks;
-   CPU usage for services;
-   CPU usage for cores and nodes;
-   spent RAM;
-   available and used memory;
-   number of CPUs;
-   google.com availability;
-   number of messages sent to rabbitmq;
-   number of messages processed in rabbitmq;
-   number of bookings;
-   number of requests received at the gateway;
-   number of user authorization requests received;
-   application logs.

### Custom metrics from spring boot services
![2.1](./images/part_2/2.1.png)
![2.2](./images/part_2/2.2.png)
![2.3](./images/part_2/2.3.png)

### Cadvisor's metrics
![2.4](./images/part_2/2.4.png)

### Node exporter's metrics
![2.5](./images/part_2/2.5.png)

### Blackbox exporter's metrics
![2.6](./images/part_2/2.6.png)

### Application logs - Loki
![2.7](./images/part_2/2.7.png)