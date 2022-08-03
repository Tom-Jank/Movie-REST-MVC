package com.example.demo.controller;

import com.example.demo.entity.Actor;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/actors")
@RestController
public class ActorController {
    @Autowired
    private ActorService actorService;
    @GetMapping("/{id}")
    public Actor getActor(@PathVariable Long id) {
        return actorService.findActorById(id);
    }

    @PostMapping(value = "")
    public Actor saveActor(@Valid @RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @PutMapping(value = "")
    public Actor updateActor(@Valid @RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteActor(@PathVariable Long id) {
        actorService.deleteActorById(id);
        return "Successfully deleted";
    }
}
