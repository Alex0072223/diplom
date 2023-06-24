package com.example.diplom.repositories;

import com.example.diplom.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByFullName(String fullName);
    Optional<Person> findByLogin(String login);
}
//поиск по статьям