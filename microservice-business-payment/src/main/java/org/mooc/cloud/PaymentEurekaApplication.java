package org.mooc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    // 使用 eureka 作为注册中心使用
public class PaymentEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentEurekaApplication.class, args);
	}
}
