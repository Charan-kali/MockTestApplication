package com.MockTest.controller;


import com.MockTest.entity.Option;
import com.MockTest.service.OptionService;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/options")
@CrossOrigin("(origins = \"http://localhost:3000\")")
public class Optioncontroller {



    private final OptionService service;



    public Optioncontroller(
            OptionService service) {

        this.service = service;
    }



    // Add Option to Question
    @PostMapping("/{questionId}")
    public Option addOption(
            @PathVariable Long questionId,
            @RequestBody Option option) {


        return service.addOption(questionId, option);
    }

}