package edu.ksu.SWE3313;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping({
        "/",
        "/hello"
    })
    public String hello(@RequestParam(value = "name", defaultValue = "World",
        required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/login")
    //@ResponseBody
    public String login(@RequestParam("email") String userid, @RequestParam("password") String pw) {
        return "logged_in";
    }
}
