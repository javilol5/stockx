package edu.estatuas.stockx;

public class Bid implements Offer{
    private String size = "";
    private Integer ask = 0;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.ask;
    }

    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }

    public String toString() {
        return this.size + " " + this.value();
    }
}
