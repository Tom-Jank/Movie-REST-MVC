package com.example.demo.service;

import com.example.demo.entity.Actor;

public interface ActorService {
    Actor findActorById(Long id);

    Actor saveActor(Actor actor);

    Actor updateActor(Actor actor);

    void deleteActorById(Long id);
}
