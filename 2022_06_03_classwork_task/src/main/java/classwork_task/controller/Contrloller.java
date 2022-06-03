package classwork_task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Contrloller {


    @PostMapping("/dear-user")
    @ResponseBody
    public String dearUser(@ModelAttribute String userName) {
        return "Dear " + userName;
    }
    @GetMapping("/home-page")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "user") String name, Model model) {
        model.addAttribute("name", name);
        return null;
    }

}
