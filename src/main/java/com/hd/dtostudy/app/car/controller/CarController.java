package com.hd.dtostudy.app.car.controller;

import com.hd.dtostudy.app.car.dto.CarResponseDto;
import com.hd.dtostudy.app.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/car/test")
    public CarResponseDto test(
            @RequestParam Long userId,
            @RequestParam Long carId
    ){
        CarResponseDto responseDto =  carService.getCarAndUserAddress(userId, carId);
        return responseDto;
    }

}
