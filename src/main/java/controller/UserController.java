package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String printUser(ModelMap modelMap) {
        List<User> users = new ArrayList<>();

        modelMap.addAttribute("users", users);
        return "user";
    }
}
