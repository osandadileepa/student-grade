package com.osanda.studentgrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.osanda.studentgrade.model.Result;

@RepositoryRestResource(exported = true)
public interface ResultRepository extends JpaRepository<Result, Long> {

}
