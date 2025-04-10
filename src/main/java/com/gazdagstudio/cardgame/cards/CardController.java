package com.gazdagstudio.cardgame.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @RequestMapping("/cards")
    public List<Card> getAllTopics(){
        return Arrays.asList(
                new Card("1", "Mallorca Sprint", "This is the challange", GroupSize.DUO),
                new Card("2", "Mallorca ydas", "This is the challange", GroupSize.ANY),
                new Card("3", "Mallorca Sprasdagfasfasint", "This is the challange", GroupSize.MORE)
        );
    }
}
