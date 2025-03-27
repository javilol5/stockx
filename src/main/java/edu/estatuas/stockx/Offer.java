package edu.estatuas.stockx;

public interface Offer extends Comparable<Offer> {

    String size();
    int value();
    int compareTo(Offer offer);





}
