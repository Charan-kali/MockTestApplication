package com.MockTest.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "mock_tests")
public class MockTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer duration;

    private Integer totalMarks;


    @OneToMany(
            mappedBy = "mockTest",
            cascade = CascadeType.ALL
    )
    private List<Question> questions;



    public MockTest() {

    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public Integer getTotalMarks() {
        return totalMarks;
    }


    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }


    public List<Question> getQuestions() {
        return questions;
    }


    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}