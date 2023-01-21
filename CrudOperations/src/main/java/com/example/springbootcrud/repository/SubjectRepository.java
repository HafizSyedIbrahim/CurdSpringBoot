package com.example.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootcrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{

}
