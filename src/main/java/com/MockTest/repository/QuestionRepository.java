package com.MockTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MockTest.entity.Question;

public interface QuestionRepository extends JpaRepository< Question, Long> {

}
