package com.example.demo.repository;

import com.example.demo.entity.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {
    Actor findActorById(Long id);
    void deleteActorById(Long id);
}
