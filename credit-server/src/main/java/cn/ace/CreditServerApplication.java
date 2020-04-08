package cn.ace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Askyi
 */
@SpringBootApplication
@EnableEurekaClient
public class CreditServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditServerApplication.class, args);
    }

}
