package org.example.repository;

import org.example.entity.Person;

import java.util.List;

public interface PersonRepository {

    boolean savePerson(Person person);

    Person getPersonByName(String name);

    List<Person> getAllPersons();

    boolean updatePerson(Person person);

    boolean deletePerson(Person person);
}
