package com.example.interviews.controller;

import com.example.interviews.model.CandidatesService;
import com.example.interviews.view.candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/candidates")
public class candidatesController {

    @Autowired
    private CandidatesService candidatesService;

    @GetMapping(value = {"/", ""})
    public List<candidates> getAllCandidates(){
        return candidatesService.findAll();
    }
    @GetMapping("/{id}")
    public candidates getCandidateById(@PathVariable int id){
        return candidatesService.getById(id);
    }
    @PostMapping(value = {"/", ""})
    public candidates createNewCandidate(@RequestBody candidates todo){
        if (candidatesService.save(todo)) return todo;
        return null;
    }

    @PutMapping("/{id}")
    public void modifyCandidate(@PathVariable int id, @RequestBody candidates todo){
        candidatesService.edit(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable int id){
        candidatesService.delete(id);
    }

}
