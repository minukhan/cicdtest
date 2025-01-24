package com.hd.dtostudy.app.car.dto;


import com.hd.dtostudy.app.car.entity.Car;
import com.hd.dtostudy.app.user.entity.User;

public record CarResponseDto(
        String handle,
        String model,
        int year,
        String address
) {

    public static CarResponseDto of(User user, Car car ) {

        return new CarResponseDto(
                user.getAddress(),
                car.getHandle(),
                car.getYear(),
                car.getModel()
        );

    }
}
