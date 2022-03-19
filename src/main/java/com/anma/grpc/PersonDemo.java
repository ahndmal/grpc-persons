package com.anma.grpc;

import com.anma.grpc.models.Car;
import com.anma.grpc.models.Person;

public class PersonDemo {
    public static void main(String[] args) {

        Car car = Car.newBuilder()
                .setMake("sweden")
                .setModel("volvo")
                .build();
        Person vasyl = Person.newBuilder()

                .setAge(20)
                .setName("Vasyl")
                .build();
        System.out.println(vasyl);

    }
}
