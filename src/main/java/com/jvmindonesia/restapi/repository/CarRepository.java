package com.jvmindonesia.restapi.repository;

import com.jvmindonesia.restapi.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
