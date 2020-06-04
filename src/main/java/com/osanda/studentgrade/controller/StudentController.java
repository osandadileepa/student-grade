package com.osanda.studentgrade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController()
@RequiredArgsConstructor
@RequestMapping(value = "${spring.data.rest.base-path}/student-detail/")
public class StudentController {

}
