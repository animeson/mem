package com.animeson.annet.controller;

import com.animeson.annet.dto.ResponseDto;
import com.animeson.annet.services.ResponseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    private final ResponseService responseService;

    public MainController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping("/")
    public String mainPage(@ModelAttribute("pass") ResponseDto responseDto) {
        return "index";
    }

    @PostMapping("/")
    public String response(@ModelAttribute("pass") ResponseDto responseDto) {
        if (responseService.response(responseDto)) {
            return "redirect:https://animeson.github.io/valentine/";
        }
        return "redirect:/";
    }


}
