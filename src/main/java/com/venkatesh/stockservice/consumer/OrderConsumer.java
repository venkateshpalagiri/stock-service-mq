package com.venkatesh.stockservice.consumer;

import com.venkatesh.stockservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private Logger LOGGER= LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.order.name}")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order event received => %s",orderEvent.toString()));

        // save order event data in database
    }
}
