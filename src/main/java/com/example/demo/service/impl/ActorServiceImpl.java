package com.example.demo.service.impl;

import com.example.demo.entity.Actor;
import com.example.demo.repository.ActorRepository;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;
    @Override
    public Actor findActorById(Long id) {
        return actorRepository.findActorById(id);
    }

    @Override
    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor updateActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public void deleteActorById(Long id) {
        actorRepository.deleteActorById(id);
    }

}
