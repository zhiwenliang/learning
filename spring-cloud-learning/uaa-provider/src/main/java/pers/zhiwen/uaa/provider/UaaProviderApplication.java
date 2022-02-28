package pers.zhiwen.uaa.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UaaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UaaProviderApplication.class, args);
    }
}
