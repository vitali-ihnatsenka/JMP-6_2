package com.epam.jmp6.reader;

import com.epam.jmp6.domain.Person;

/**
 * Created by Vitali on 24.08.2016.
 */
public interface PersonReader {
    Person readPerson(String name);
}
