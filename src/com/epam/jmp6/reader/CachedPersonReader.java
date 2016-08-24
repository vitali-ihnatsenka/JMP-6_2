package com.epam.jmp6.reader;

import com.epam.jmp6.domain.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitali on 24.08.2016.
 */
public class CachedPersonReader implements PersonReader {
    private PropertiesPersonReader propertiesPersonReader;
    private Map<String, Person> cache = new HashMap<String, Person>();

    public CachedPersonReader(String filePath) {
        this.propertiesPersonReader = new PropertiesPersonReader(filePath);
    }


    @Override
    public Person readPerson(String name) {
        Person person = cache.get(name);
        if(person != null){
            return person;
        }
        person = propertiesPersonReader.readPerson(name);
        cache.put(name, person);
        return person;
    }
}
