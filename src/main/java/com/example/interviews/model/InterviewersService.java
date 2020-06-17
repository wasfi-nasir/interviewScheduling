package com.example.interviews.model;

import com.example.interviews.view.interviewers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InterviewersService {
    private List<interviewers> data = new ArrayList<>( Arrays.asList(
            new interviewers(1,"Mosab", "0595000000", "mosab@gmail.com", "Backend developer"),
            new interviewers(2,"Ali",  "0592000000", "Ali@gmail.com", "Frontend developer"),
            new interviewers(3,"Daoud",  "0598000000", "Daoud@gmail.com", "DV"),
            new interviewers(4,"Alaa",  "0599000000", "Alaa@gmail.com", "Frontend developer")

    ));

    public List<interviewers> findAll() {
        return data;
    }

    public interviewers getById(int id) {
        for (interviewers todo: data)
            if (todo.getId() == id) return todo;
        return null;
    }
    public boolean save(interviewers todo){
        return data.add(todo);
    }
    public void delete(int id){
        for (interviewers interviewer: data)
            if (interviewer.getId() == id)  data.remove(interviewer);
    }

    public void edit(int id, interviewers interviewerModify) {
        for (int i =0; i < data.size(); i++) {
            interviewers t = data.get(i);
            if (t.getId() == id)
                data.set(i, interviewerModify);
        }
    }
}
