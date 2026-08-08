package com.MockTest.service;



import java.util.List;

import com.MockTest.entity.Question;

public interface QuestionService {


    Question addQuestion(Long testId, Question question);


    List<Question> getAllQuestions();


    Question getQuestionById(Long id);


    void deleteQuestion(Long id);

}