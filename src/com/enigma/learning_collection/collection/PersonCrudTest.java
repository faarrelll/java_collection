package com.enigma.learning_collection.collection;

public class PersonCrudTest {
    public static void main(String[] args) {
        PersonRepository personCrudApp = new PersonRepository();
        System.out.println(personCrudApp.getPersonList());
        personCrudApp.addPerson(new Person("Udin", 50));
        personCrudApp.addPerson(new Person("Udin", 25));
        personCrudApp.addPerson(new Person("Asep", 30));
        personCrudApp.addPerson(new Person("Mamang", 40));
        personCrudApp.addPerson(new Person("Odin", 20));
        System.out.println(personCrudApp.getPersonList());
        System.out.println(personCrudApp.getFirstPersonByName("Udin"));
        System.out.println(personCrudApp.getPersonListFilterByName("Udin"));
        personCrudApp.deletePerson(new Person("Odin", 20));
        System.out.println(personCrudApp.getPersonList());
    }
}
