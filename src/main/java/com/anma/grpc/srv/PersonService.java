package com.anma.grpc.srv;

import com.anma.grpc.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PersonService  {

    public static void writePerson(Person person)  {
        try {
            person.writeTo(Files.newOutputStream(Path.of("models/person"), StandardOpenOption.WRITE));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
