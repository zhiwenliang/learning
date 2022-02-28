package pers.zhiwen.uaa.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/test")
    public String test() {
        return "This is a test.";
    }
}
