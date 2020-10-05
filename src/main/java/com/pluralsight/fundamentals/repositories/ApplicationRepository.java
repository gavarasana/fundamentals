package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.entities.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
