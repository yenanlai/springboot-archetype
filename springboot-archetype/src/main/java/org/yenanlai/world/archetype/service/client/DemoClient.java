package org.yenanlai.world.archetype.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Feign定义
 */
@FeignClient(name = "DEMO", url = "https://www.baidu.com")
public interface DemoClient {

    @RequestMapping("/")
    String get();
}
