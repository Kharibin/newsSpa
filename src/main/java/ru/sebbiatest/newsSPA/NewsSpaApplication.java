package ru.sebbiatest.newsSPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class NewsSpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsSpaApplication.class, args);
    }
}
