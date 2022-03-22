package com.anma.grpc;

import com.anma.grpc.models.Person;
import com.anma.grpc.srv.PersonService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
        // WRITE
        Person vasyl = Person.newBuilder()
                .setAge(20)
                .setName("Vasyl")
                .build();

        PersonService.writePerson(vasyl);

        // READ
        Person vasyl2 = PersonService.read("models/person");
        System.out.println(vasyl2);

    }


}
