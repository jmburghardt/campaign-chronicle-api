package com.campaignchronicle.campaignchronicle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starter")
public class StartingController {

    @GetMapping("/thing")
    public void starterPrint() {
        System.out.println("Winner");
    }
}
