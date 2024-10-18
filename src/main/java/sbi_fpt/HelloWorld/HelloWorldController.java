package sbi_fpt.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Chào mừng đến với ứng dụng Spring Boot của tôi!";
    }
}
