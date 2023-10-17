package tobiasjohansson.m4eurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class M4EurekaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(M4EurekaServiceRegistryApplication.class, args);
	}

}
