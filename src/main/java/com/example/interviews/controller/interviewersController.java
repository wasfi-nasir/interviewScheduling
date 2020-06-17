package com.example.interviews.controller;

import com.example.interviews.model.InterviewersService;
import com.example.interviews.view.interviewers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/interviewers")
public class interviewersController {

    @Autowired
    private InterviewersService interviewersService;

    @GetMapping(value = {"/", ""})
    public List<interviewers> getAllInterviewer(){
        return interviewersService.findAll();
    }
    @GetMapping("/{id}")
    public interviewers getInterviewerById(@PathVariable int id){
        return interviewersService.getById(id);
    }
    @PostMapping(value = {"/", ""})
    public interviewers createNewInterviewer(@RequestBody interviewers todo){
        if (interviewersService.save(todo)) return todo;
        return null;
    }

    @PutMapping("/{id}")
    public void modifyInterviewer(@PathVariable int id, @RequestBody interviewers todo){
        interviewersService.edit(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteInterviewer(@PathVariable int id){
        interviewersService.delete(id);
    }

}
