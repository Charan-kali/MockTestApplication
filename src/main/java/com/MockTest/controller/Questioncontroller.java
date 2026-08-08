package com.MockTest.controller;


import com.MockTest.entity.Question;
import com.MockTest.service.QuestionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/questions")
@CrossOrigin("(origins = \"http://localhost:3000\")")
public class Questioncontroller {



    private final QuestionService service;



    public Questioncontroller(
            QuestionService service) {

        this.service = service;
    }



    // Add Question to Mock Test
    @PostMapping("/{testId}")
    public Question addQuestion(
            @PathVariable Long testId,
            @RequestBody Question question) {


        return service.addQuestion(testId, question);
    }




    // Get All Questions
    @GetMapping
    public List<Question> getAllQuestions() {

        return service.getAllQuestions();
    }




    // Get Question By Id
    @GetMapping("/{id}")
    public Question getQuestionById(
            @PathVariable Long id) {


        return service.getQuestionById(id);
    }




    // Delete Question
    @DeleteMapping("/{id}")
    public String deleteQuestion(
            @PathVariable Long id) {


        service.deleteQuestion(id);

        return "Question Deleted Successfully";
    }

}