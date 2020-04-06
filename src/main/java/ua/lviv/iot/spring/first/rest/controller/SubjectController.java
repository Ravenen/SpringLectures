package ua.lviv.iot.spring.first.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.first.business.SubjectService;
import ua.lviv.iot.spring.first.rest.model.Subject;

@RestController
@RequestMapping("/sibjects")
public class SubjectController {

  private SubjectService subjectService;

  @GetMapping
  public List<Subject> getAllSubjects() {
    return subjectService.getAllSubjects();
  }
}
