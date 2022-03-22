package com.anma.grpc;

import com.anma.grpc.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
        Person vasyl = Person.newBuilder()
                .setAge(20)
                .setName("Vasyl")
                .build();

        writePerson(vasyl);

        Person two = read("models/person");
        System.out.println(two);

    }

    private static void writePerson(Person person) throws IOException {
       person.writeTo(Files.newOutputStream(Path.of("models/person"), StandardOpenOption.WRITE));
    }

    public static Person read(String file) {
        Person person = null;
        try {
            person = Person.parseFrom(Files.newInputStream(Path.of(file), StandardOpenOption.CREATE_NEW));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
}
