package org.demo.some;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by zhaol on 2017/12/28.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }

}
