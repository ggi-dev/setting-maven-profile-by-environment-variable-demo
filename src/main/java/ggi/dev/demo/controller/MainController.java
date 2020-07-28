package ggi.dev.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    @Value("${maven.type.profile}")
    private String mavenTypeProfile;

    @GetMapping
    public String main() {
        return !StringUtils.isEmpty(mavenTypeProfile) ? mavenTypeProfile : "Error!";
    }
}
