package org.yenanlai.world.archetype;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication()
@EnableFeignClients
@MapperScan(basePackages = "org.yenanlai.world.archetype.domain.mapper")
public class SpringbootArchetypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootArchetypeApplication.class, args);
    }

}
