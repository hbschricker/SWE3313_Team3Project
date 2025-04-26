package edu.ksu.SWE3313;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingCollector
{
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Hello World!";
    }
}
