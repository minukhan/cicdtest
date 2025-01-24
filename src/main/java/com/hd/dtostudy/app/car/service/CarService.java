package com.hd.dtostudy.app.car.service;


import com.hd.dtostudy.app.car.dto.CarResponseDto;
import com.hd.dtostudy.app.car.entity.Car;
import com.hd.dtostudy.app.car.repository.CarRepository;
import com.hd.dtostudy.app.user.entity.User;
import com.hd.dtostudy.app.user.repositroy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;



    public CarResponseDto getCarAndUserAddress(Long userId, Long carId){

        User user = userRepository.findById(userId).orElseThrow(() -> (new IllegalArgumentException("User not found")));
        Car car = carRepository.findById(carId).orElseThrow(() -> (new IllegalArgumentException("Car not found")));

        return CarResponseDto.of(user,car);
    }



}
