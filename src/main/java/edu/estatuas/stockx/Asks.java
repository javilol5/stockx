package edu.estatuas.stockx;


import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria {

    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
                .filter(o -> o instanceof Ask)
                .sorted()
                .collect(Collectors.toList());

    }
}
