package edu.estatuas.stockx;

import java.util.List;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();
    void add(Offer offer);
    List<Offer> offers();
    void setBid(int Bid);
    void setAsk(int Ask);
    void setSale(int Sale);


}
