package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.entities.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Integer> {
}
