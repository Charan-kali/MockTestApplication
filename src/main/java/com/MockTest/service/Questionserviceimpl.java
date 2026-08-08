package com.MockTest.service;

import com.MockTest.entity.MockTest;
import com.MockTest.entity.Question;
import com.MockTest.repository.MockTestRepository;
import com.MockTest.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Questionserviceimpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final MockTestRepository mockTestRepository;

    public Questionserviceimpl(QuestionRepository questionRepository,
                               MockTestRepository mockTestRepository) {
        this.questionRepository = questionRepository;
        this.mockTestRepository = mockTestRepository;
    }

    @Override
    public Question addQuestion(Long testId, Question question) {

        MockTest test = mockTestRepository.findById(testId)
                .orElseThrow(() ->
                        new RuntimeException("Mock Test not found"));

        question.setMockTest(test);

        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Question not found"));
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}