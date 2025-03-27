package edu.estatuas.stockx;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
















}
