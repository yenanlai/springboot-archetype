package org.yenanlai.world.archetype.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * 国际化配置
 */
@Configuration
public class MessageSourceConfig {

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
