package com.example.sec.web;

import com.example.sec.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class ChangePasswordController {
    private UserService userService;

    public ChangePasswordController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/change-password")
    String changePassword(@RequestParam String newPassword){
        userService.changeCurrentUserPassword(newPassword);
        return "redirect:/logout";
    }
}
