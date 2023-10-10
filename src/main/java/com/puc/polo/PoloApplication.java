package com.puc.polo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.puc.polo.*")
@EnableJpaRepositories("com.puc.polo.repositories")
@EntityScan(basePackages = "com.puc.polo.entity")
public class PoloApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoloApplication.class, args);
    }

}
