package com.example.demo.controleur;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.ExPerson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExMainController {

    private static List<ExPerson> persons = new ArrayList<ExPerson>();

    static {
        persons.add(new ExPerson("Bill", "Gates"));
        persons.add(new ExPerson("Steve", "Jobs"));
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

}