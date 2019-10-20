package git.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainWebApplication {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MainWebApplication.class, args);
    }

}