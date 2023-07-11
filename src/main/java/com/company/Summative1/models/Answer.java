package com.company.Summative1.models;

import java.util.Objects;

public class Answer {
    private int id;
    private String question;
    private String answer;

    public Answer(){}

    public Answer(int id, String answer){
        this.id = id;
        this.answer = answer;
    }

    public Answer(int id, String question, String answer){
        this.question = question;
        this.id = id;
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return id == answer1.id && question.equals(answer1.question) && answer.equals(answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
