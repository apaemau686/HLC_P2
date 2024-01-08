package com.hlc.subjectsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectsImpl implements Subjects{
    @Override
    @GetMapping("/subjects")
    public List<String> getAllSubjects() {
        List<String> subjects = List.of("Acceso a datos", "Desarrollo de interfaces", "Desarrollo móvil");

        return subjects;
    }
}
