package com.example.ModelView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ModelViewApplication {
    private List<String> friendList = new ArrayList<>();

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("friends", friendList);
        return "index";
    }

    @PostMapping("/addFriend")
    public String addFriend(@RequestParam String friendName) {
        friendList.add(friendName);
        return "redirect:/index";
    }
}
