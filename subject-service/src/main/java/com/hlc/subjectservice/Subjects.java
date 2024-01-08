package com.hlc.subjectservice;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
public interface Subjects {
    @GetMapping("/subjects")
    List<String> getAllSubjects();
}