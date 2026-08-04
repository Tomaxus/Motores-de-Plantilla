package com.web.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Arrays;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nombre", "TOMAS");

        List<String> sobre_mi = Arrays.asList(
            "Soy apasionado por Linux, los sistemas operativos y la seguridad.",
            "También soy aprendiz en el desarrollo web.",
            "Tengo muchas ganas de aprender y mejorar cada día."
        );

        List<String> intereses = Arrays.asList(
            "Programación",
            "Linux",
            "Aprender nuevas tecnologías"
        );

        List<String> objetivos = Arrays.asList(
            "Mejorar mis habilidades en desarrollo web.",
            "Construir páginas modernas y funcionales."
        );

        model.addAttribute("sobre_mi", sobre_mi);
        model.addAttribute("intereses", intereses);
        model.addAttribute("objetivos", objetivos);

        return "index";
    }
}

