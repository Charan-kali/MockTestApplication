package com.MockTest.service;



import com.MockTest.entity.Option;
import com.MockTest.entity.Question;
import com.MockTest.repository.OptionRepository;
import com.MockTest.repository.QuestionRepository;

import org.springframework.stereotype.Service;



@Service
public class Optionserviceimpl 
implements OptionService {



    private final OptionRepository optionRepository;

    private final QuestionRepository questionRepository;



    public Optionserviceimpl(
            OptionRepository optionRepository,
            QuestionRepository questionRepository) {

        this.optionRepository = optionRepository;
        this.questionRepository = questionRepository;
    }




    @Override
    public Option addOption(
            Long questionId,
            Option option) {


        Question question =
                questionRepository.findById(questionId)
                .orElseThrow(() ->
                new RuntimeException("Question not found"));



        option.setQuestion(question);


        return optionRepository.save(option);

    }
}