package org.mooc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceZuulApplication {

	/**
	 * Eureka is the Netflix Service Discovery Server and Client.
	 * The server can be configured and deployed to be highly available,
	 * with each server replicating state about the registered services to the others.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulApplication.class, args);
	}

}
