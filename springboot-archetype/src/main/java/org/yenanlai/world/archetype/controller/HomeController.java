package org.yenanlai.world.archetype.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yenanlai.world.archetype.service.client.DemoClient;

import io.swagger.annotations.Api;

/**
 * Feign测试示例
 */
@Api(tags = "测试", description = "information about test")
@RestController
public class HomeController {

    @Resource
    private DemoClient demoClient;

    @GetMapping("/")
    public String index() {
        return "Hello 🌍";
    }

    @GetMapping("/baidu")
    public String baidu() {
        return demoClient.get();
    }
}
