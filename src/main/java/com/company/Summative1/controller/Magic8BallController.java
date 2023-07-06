package com.company.Summative1.controller;

import com.company.Summative1.models.Answer;
import com.company.Summative1.models.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class Magic8BallController {

    List<String> responses = List.of("Truly wonderful, the mind of a child is.",
            "The greatest teacher, failure is.",
            "Judge me by my size, do you?",
            "When nine hundred years old you reach, look as good you will not.",
            "Attachment leads to jealousy. The shadow of greed, that is.",
            "Beware…anger, fear, aggression. The Dark Side are they.",
            "Wars not make one great.",
            "That is why you fail.",
            "Fear is the path to the dark side...fear leads to anger...anger leads to hate...hate leads to suffering.",
            "Do or do not. There is no try.");

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    //@ResponseBody
    public Answer getMagicAnswer(@RequestBody(required = false) Question question) {
        int index = (int) (Math.random() * responses.size());
        String answer = responses.get(index);
        Answer response;

        if(question != null){
            response = new Answer(index,question.getQuestion(), answer);
        }
        else{
            response = new Answer(index,answer);
        }
        return response;
    }

}
