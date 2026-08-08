package com.MockTest.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "options")
public class Option {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String optionText;


    private Boolean correct;



    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;



    public Option(){

    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id=id;
    }


    public String getOptionText() {
        return optionText;
    }


    public void setOptionText(String optionText) {
        this.optionText=optionText;
    }


    public Boolean getCorrect() {
        return correct;
    }


    public void setCorrect(Boolean correct) {
        this.correct=correct;
    }


    public Question getQuestion() {
        return question;
    }


    public void setQuestion(Question question) {
        this.question=question;
    }
}
