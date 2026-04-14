package br.com.domingos.rabbitMQ_docker.consumer;

import br.com.domingos.rabbitMQ_docker.entity.Product;
import br.com.domingos.rabbitMQ_docker.messengerConfig.ProductMessageConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductConsumer {
    @RabbitListener(bindings = @QueueBinding(value = @Queue(ProductMessageConfig.NAME_QUEUE),
            exchange = @Exchange(name = ProductMessageConfig.NAME_EXCHANGE),
            key = ProductMessageConfig.ROUTING_KEY))
    public void processMessage(final Message message, final Product product) {

        log.info("Priority {}", message.getMessageProperties().getPriority());
        log.info("Consuming product {}", product);
    }
}
