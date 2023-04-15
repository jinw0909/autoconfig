package hello;

import hello.config.MemoryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigApplication.class, args);
    }

}
