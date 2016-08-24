package com.epam.jmp6.reader;

import com.epam.jmp6.domain.Person;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Vitali on 24.08.2016.
 */
public class PropertiesPersonReader implements PersonReader {
    private String filePath;

    public PropertiesPersonReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Person readPerson(String name) {
        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream(filePath);
            properties.load(fis);
            String userName = properties.getProperty(name + ".name");
            String userLogin = properties.getProperty(name + ".login");
            String userPasword = properties.getProperty(name + ".password");
            return new Person(userName, userLogin, userPasword);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}
