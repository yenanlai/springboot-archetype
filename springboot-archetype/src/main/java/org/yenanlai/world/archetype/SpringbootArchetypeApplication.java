package org.yenanlai.world.archetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.yenanlai.world.archetype.i18n.MessageSources;

@SpringBootApplication()
@EnableFeignClients
public class SpringbootArchetypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootArchetypeApplication.class, args);
    }

    @Bean
    public MessageSources messageSources(MessageSource messageSource) {
        return new MessageSources(messageSource);
    }

    @Bean("messageSource")
    public ResourceBundleMessageSource resourceBundleMessageSource() {
        ResourceBundleMessageSource resolver = new ResourceBundleMessageSource();
        resolver.setBasename("messages");
        resolver.setUseCodeAsDefaultMessage(true);
        resolver.setDefaultEncoding("UTF-8");
        return resolver;
    }
}
