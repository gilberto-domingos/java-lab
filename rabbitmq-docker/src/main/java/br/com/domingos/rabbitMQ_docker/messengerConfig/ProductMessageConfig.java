package br.com.domingos.rabbitMQ_docker.messengerConfig;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductMessageConfig {

    public static final String NAME_QUEUE = "QueueProduct";
    public static final String NAME_EXCHANGE = "ExchangeProduct";
    public static final String ROUTING_KEY = "createProduct";

    @Bean
    DirectExchange productExchange() {
        return new DirectExchange(NAME_EXCHANGE);
    }

    @Bean
    Queue queue() {
        return QueueBuilder.durable(NAME_QUEUE).build();
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue()).to(productExchange()).with(ROUTING_KEY);
    }

}
