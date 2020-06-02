package com.osanda.studentgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.osanda.studentgrade.model.Question;

@RepositoryRestResource(exported = true)
public interface QuestionRepositiry extends JpaRepository<Question, Long> {

}
