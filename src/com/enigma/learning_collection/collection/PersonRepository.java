package com.enigma.learning_collection.collection;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List<Person> personList = new ArrayList<>();

    // CREATE
    public void addPerson(Person person) {
        if (person != null) {
            personList.add(person);
        } else {
            throw new RuntimeException("person must not be null");
        }
    }

    // READ
    public List<Person> getPersonListFilterByName(String name) {
        List<Person> filteredPersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                filteredPersonList.add(person);
            }
        }
        return filteredPersonList;
    }

    // READ
    public Person getFirstPersonByName(String name) {
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    // READ
    public List<Person> getPersonList() {
        return personList;
    }

    // UPDATE
    public void updatePerson(Person currentPerson, Person updatedPerson) {
        int updatedIndex = personList.indexOf(currentPerson);
        personList.set(updatedIndex, updatedPerson);
    }

    // DELETE
    public void deletePerson(Person currentPerson) {
        for (int i = 0; i < personList.size(); i++) {
            Person currentIterationPerson = personList.get(i);
            if (currentIterationPerson.getName().equals(currentPerson.getName()) &&
                    currentIterationPerson.getAge() == currentPerson.getAge()) {
                personList.remove(currentIterationPerson);
                break;
            }
        }
    }
}
