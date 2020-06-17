package com.example.interviews.model;

import com.example.interviews.view.candidates;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CandidatesService {
    private List<candidates> data = new ArrayList<>( Arrays.asList(
            new candidates(1,"Ahmad", "15/6/2020", "10 am", "10 am", "Java"),
            new candidates(2,"Khaled",  "15/6/2020", "11 am", "12 pm", "backend"),
            new candidates(3,"Wesam",  "15/6/2020", "11 am", "12 pm", "DV"),
            new candidates(4,"Husam",  "15/6/2020", "1 pm", "2 pm", "frontend")

    ));

    public List<candidates> findAll() {
        return data;
    }

    public candidates getById(int id) {
        for (candidates todo: data)
            if (todo.getId() == id) return todo;
        return null;
    }
    public boolean save(candidates todo){
        return data.add(todo);
    }
    public void delete(int id){
        for (candidates candidate: data)
            if (candidate.getId() == id)  data.remove(candidate);
    }

    public void edit(int id, candidates candidateModify) {
        for (int i =0; i < data.size(); i++) {
            candidates t = data.get(i);
            if (t.getId() == id)
                data.set(i, candidateModify);
        }
    }
}
