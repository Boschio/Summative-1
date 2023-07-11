package com.company.Summative1.controller;

import com.company.Summative1.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {

    private static int idCounter = 1;
    private List<Quote> quotes = List.of(new Quote(idCounter++,"George Carlin" , "I went to a bookstore and asked the saleswoman, 'Where's the self-help section?' She said if she told me, it would defeat the purpose."),
            new Quote(idCounter++, "Dale Carnegie", "You can make more friends in two months by becoming interested in other people than you can in two years by trying to get other people interested in you."),
            new Quote(idCounter++, "Shannon Alder", "Anger, resentment and jealousy doesn't change the heart of others-- it only changes yours."),
            new Quote(idCounter++, "Pandora Poikilos", "The best relationships in our lives are the best not because they have been the happiest ones, they are that way because they have stayed strong through the most tormentful of storms."),
            new Quote(idCounter++,"Sheryl Sandberg", "What would you do if you weren't afraid?"),
            new Quote(idCounter++, "Stephen Richards", "You are essentially who you create yourself to be and all that occurs in your life is the result of your own making."),
            new Quote(idCounter++, "Mark Manson", "Life is essentially an endless series of problems. The solution to one problem is merely the creation of another."),
            new Quote(idCounter++, "Idowu Koyenikan", "You must have a level of discontent to feel the urge to want to grow."),
            new Quote(idCounter++, "Sherry Argov", "Once you start laughing, you start healing."),
            new Quote(idCounter++, "Sanober Khan", "Even\n" +
                    "in the loneliest moments\n" +
                    "\n" +
                    "i have been there\n" +
                    "for myself.")
            );

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {
        int index = (int) (Math.random() * quotes.size());
        Quote result = quotes.get(index);
        return result;
    }

}
