package com.hd.dtostudy.app.car.repository;


import com.hd.dtostudy.app.car.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CarRepository extends CrudRepository<Car, Long> {
}
