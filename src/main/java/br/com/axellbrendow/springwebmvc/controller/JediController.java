package br.com.axellbrendow.springwebmvc.controller;

import br.com.axellbrendow.springwebmvc.model.Jedi;
import br.com.axellbrendow.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JediController {
    @Autowired
    private JediRepository repository;

    @GetMapping("/jedi")
    public ModelAndView jedi() {
        final var modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");
        modelAndView.addObject("allJedi", repository.getAllJedi());
        return modelAndView;
    }

    @GetMapping("/new-jedi")
    public ModelAndView newJedi() {
        final var modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jedi");
        modelAndView.addObject("jedi", new Jedi());
        return modelAndView;
    }
}
