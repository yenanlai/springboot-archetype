package org.yenanlai.world.archetype.i18n;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.StringUtils;

public class MessageSources implements MessageSource {

    private MessageSource messageSource;

    public MessageSources(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String get(String code) {
        return get(code, "");
    }

    public String get(String code, String args) {
        if (this.messageSource == null) return code;
        return this.messageSource.getMessage(code, new String[] { args }, null,
                LocaleContextHolder.getLocale());
    }

    public String get(String code, String... args) {
        if (this.messageSource == null) return code;
        return this.messageSource.getMessage(code, args, null, LocaleContextHolder.getLocale());
    }

    public String getMessage(String code, Object[] args, String defaultMessage) {
        if (this.messageSource == null) return code;
        return this.messageSource.getMessage(code, args, defaultMessage,
                LocaleContextHolder.getLocale());
    }

    @Override
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        if (this.messageSource == null) return code;
        return this.messageSource.getMessage(code, args, defaultMessage, locale);
    }

    @Override
    public String getMessage(String code, Object[] args, Locale locale)
            throws NoSuchMessageException {
        if (this.messageSource == null) return code;
        return this.messageSource.getMessage(code, args, locale);
    }

    @Override
    public String getMessage(MessageSourceResolvable resolvable, Locale locale)
            throws NoSuchMessageException {
        return this.messageSource.getMessage(resolvable, locale);
    }

    public boolean hasCode(String code) {
        if (StringUtils.isEmpty(code)) return false;
        return !code.equals(get(code));
    }

}
