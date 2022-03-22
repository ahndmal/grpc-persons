package com.anma.grpc;

import com.anma.grpc.models.Car;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CarDemo {
    public static void main(String[] args) throws IOException {

        Car car = Car.newBuilder()
                .setMake("sweden")
                .setModel("volvo")
                .build();
        car.writeTo( Files.newOutputStream(Path.of("models/car"), StandardOpenOption.CREATE_NEW));
    }
}
