package com.company.Summative1.controller;

import com.company.Summative1.models.Definition;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WordController.class)
public class WordControllerTest {
    @Autowired
    private MockMvc mockMvc;

//    private ObjectMapper mapper = new ObjectMapper();
//
//    private List<Definition> wordList;

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void shouldGetAWord() throws Exception {
//        String outputJson = mapper.writeValueAsString(wordList);

        mockMvc.perform(get("/word"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
