package org.mrpaulwoods.databasewithuuid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class PersonBootstrap implements CommandLineRunner {

    private final PersonRepository personRepository;

    public PersonBootstrap(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) {
        Person person = personRepository.save(new Person("Paul", "Woods"));
        System.out.printf("person = %s%n", person);
    }

}
