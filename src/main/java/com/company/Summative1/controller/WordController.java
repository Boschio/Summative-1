package com.company.Summative1.controller;

import com.company.Summative1.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private List<Definition> wordList;
    private static int idCounter = 1;

    public WordController() {
        wordList = new ArrayList<>();
        wordList.add(new Definition(idCounter++,"alliaceous","of, like or pertaining to garlic; garlicky"));
        wordList.add(new Definition(idCounter++,"kith","knowledge; one's native land; one's friends"));
        wordList.add(new Definition(idCounter++,"aphnology","science of wealth"));
        wordList.add(new Definition(idCounter++,"natiform","shaped like buttocks"));
        wordList.add(new Definition(idCounter++,"uxorious","excessively fond of one's wife"));
        wordList.add(new Definition(idCounter++,"xenolith","fragment of extraneous rock embedded in magma or another rock"));
        wordList.add(new Definition(idCounter++,"loxotic","distorted; oblique"));
        wordList.add(new Definition(idCounter++,"fulgurate","to flash like lightning"));
        wordList.add(new Definition(idCounter++,"chaptalize","to add extra sugar to wine to raise alcohol content"));
        wordList.add(new Definition(idCounter++,"zygopleural","bilaterally symmetrical"));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWord() {
        Random rand = new Random();
        return wordList.get(rand.nextInt(wordList.size()));
    }

}
