package br.com.domingos.rabbitMQ_docker.messengerConfig;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMessageConfig {

    public static final String NAME_QUEUE = "QueueUser";
    public static final String NAME_EXCHANGE = "ExchangeUser";
    public static final String ROUTING_KEY = "createUser";

    @Bean
    DirectExchange usuarioExchange() {
        return new DirectExchange(NAME_EXCHANGE);
    }

    @Bean
    Queue queue() {
        return QueueBuilder.durable(NAME_QUEUE).build();
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue()).to(usuarioExchange()).with(ROUTING_KEY);
    }

}
