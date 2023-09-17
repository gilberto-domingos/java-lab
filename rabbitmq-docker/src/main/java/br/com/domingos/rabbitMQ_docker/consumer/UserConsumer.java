package br.com.domingos.rabbitMQ_docker.consumer;

import br.com.domingos.rabbitMQ_docker.entity.User;
import br.com.domingos.rabbitMQ_docker.messengerConfig.UserMessageConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserConsumer {
    @RabbitListener(bindings = @QueueBinding(value = @Queue(UserMessageConfig.NAME_QUEUE),
            exchange = @Exchange(name = UserMessageConfig.NAME_EXCHANGE),
            key = UserMessageConfig.ROUTING_KEY))
    public void processMessage(final Message message, final User user) {

        log.info("Priority {}", message.getMessageProperties().getPriority());
        log.info("Consuming user {}", user);
    }
}
