package com.maxtrain.bootcamp.StudentTable;

import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Students, Integer> {
}
