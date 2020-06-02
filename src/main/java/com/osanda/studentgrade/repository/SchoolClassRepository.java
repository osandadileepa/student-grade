package com.osanda.studentgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.osanda.studentgrade.model.SchoolClass;

@RepositoryRestResource(exported = true)
public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {

}
