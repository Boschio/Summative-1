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
        Answer answer = (Answer) o;
        return getId() == answer.getId() &&
                Objects.equals(getQuestion(), answer.getQuestion()) &&
                Objects.equals(getAnswer(), answer.getAnswer());
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
