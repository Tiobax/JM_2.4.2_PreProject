package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping()
    public String getAllUser(Model model) {
        model.addAttribute("users", usersService.readAllUsers());
        return "users/index";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "users/new";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("user") User user) {
        usersService.creatUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        System.out.println(id);
        model.addAttribute("user", usersService.readUser(id));
        return "users/edit";
    }

    @PatchMapping()
    public String updateUser(@ModelAttribute("user") User user) {
        usersService.updateUser(user);
        return "redirect:/users";
    }

    @DeleteMapping()
    public  String deleteUser(@ModelAttribute("postUser") User user) {
        System.out.println(user);
        usersService.deleteUser(user);
        return "redirect:/users";
    }
}
