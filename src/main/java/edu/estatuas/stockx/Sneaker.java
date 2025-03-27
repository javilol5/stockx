package edu.estatuas.stockx;

import java.util.List;

import java.util.ArrayList;

public class Sneaker implements Item {

    private String style = "";
    private String name = "";
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void add(Offer offer) {
        this.offers.add(offer);
    }

    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return this.name + " " + this.style;
    }

    }



