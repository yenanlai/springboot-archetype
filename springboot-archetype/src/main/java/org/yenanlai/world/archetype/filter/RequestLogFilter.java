package org.yenanlai.world.archetype.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.WebUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RequestLogFilter extends OncePerRequestFilter implements Ordered {

    private int order = Ordered.LOWEST_PRECEDENCE - 8;

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper wrappedRequest = new ContentCachingRequestWrapper(request);
        long begin = System.currentTimeMillis();
        filterChain.doFilter(wrappedRequest, response);
        String body = this.getBody(wrappedRequest);
        long end = System.currentTimeMillis();
        long cost = end - begin;
        log.info(
                "method: {}, path: {}, Accept-Language: {}, Locale-Language: {}, status: {}, query: {}, body: {}, cost: {}ms",
                request.getMethod(), request.getRequestURI(), request.getHeader("Accept-Language"),
                request.getLocale().getLanguage(), response.getStatus(), request.getQueryString(),
                body, cost);

    }

    private String getBody(ContentCachingRequestWrapper request) {
        ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request,
                ContentCachingRequestWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                String payload;
                try {
                    payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException ex) {
                    payload = "[unknown]";
                }
                return payload;
            }
        }

        return null;
    }

}
