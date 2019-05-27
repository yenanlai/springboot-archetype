package org.yenanlai.world.archetype.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "DEMO", url = "https://www.baidu.com")
public interface DemoClient {

    @RequestMapping("/")
    String get();
}
