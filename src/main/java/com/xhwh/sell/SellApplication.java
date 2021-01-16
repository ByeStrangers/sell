package com.xhwh.sell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.xhwh.sell.mapper")
@Controller
public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/page/{path}")
    public String path(@PathVariable("path") String path) {
        return String.format("page/%s", path);
    }
}
