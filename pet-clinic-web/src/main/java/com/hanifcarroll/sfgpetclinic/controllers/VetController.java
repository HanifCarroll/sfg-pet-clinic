package com.hanifcarroll.sfgpetclinic.controllers;

import com.hanifcarroll.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/vets/", "/vets.html"})
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/", "index", "index.html"})
    public String index(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
