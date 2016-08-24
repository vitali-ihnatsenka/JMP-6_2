package com.epam.jmp6;

import com.epam.jmp6.domain.Person;
import com.epam.jmp6.reader.CachedPersonReader;
import com.epam.jmp6.reader.PersonReader;

public class Main {

    public static void main(String[] args) {
        PersonReader reader = new CachedPersonReader("persons.properties");

        Person vitali = reader.readPerson("vitali");

        vitali = reader.readPerson("vitali");

    }

}
