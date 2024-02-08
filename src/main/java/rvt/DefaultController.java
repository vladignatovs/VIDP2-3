package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {

    @GetMapping(value = "/")
    ModelAndView index() {
        ArrayList<Student> students = new ArrayList<>();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("students", students);
        modelAndView.addObject("date", new Date().toString());
        return modelAndView;
    }

    @GetMapping(value = "/test")
    public ModelAndView testAction() {
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("output1", 1);
        return modelAndView;
    }

    @GetMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView("register");
        List<String> groups = new ArrayList<>(List.of("DP2-1", "DP2-2", "DP2-3", "DP2-4"));
        Student student = new Student();
        modelAndView.addObject("groups", groups);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping(value = "/register")
    public ModelAndView registerForm(@ModelAttribute("student") Student student) {
        ModelAndView modelAndView = new ModelAndView("after-register");
        // System.out.println(student.getGroup());
        // System.out.println(student.getGender());
        // System.out.println(student.isMarried());
        return modelAndView;
    }

}