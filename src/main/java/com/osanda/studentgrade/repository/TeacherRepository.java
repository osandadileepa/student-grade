package com.osanda.studentgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.osanda.studentgrade.model.Teacher;

@RepositoryRestResource(exported = true)
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
