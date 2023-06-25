package com.example.sec.web;

import com.example.sec.message.WelcomeMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class SecuredController {
    private final WelcomeMessageService welcomeMessageService;

    public SecuredController(WelcomeMessageService welcomeMessageService) {
        this.welcomeMessageService = welcomeMessageService;
    }

    @GetMapping("/secured")
    String home(@RequestParam(defaultValue = "en") String lang, Model model) {
        String welcomeMessage = welcomeMessageService.getWelcomeMessage(lang);
        model.addAttribute("lang", lang);
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "secured";
    }

//    @GetMapping("/")
//    String home(Authentication authentication, Model model) {
//        model.addAttribute("username", authentication.getName());
//        return "index";
//    }

//    @GetMapping("/")
//    String home(@CurrentSecurityContext(expression = "authentication.name") String username, Model model) {
//        model.addAttribute("username", username);
//        return "index";
//    }
}
