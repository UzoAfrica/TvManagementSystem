package org.example;

public class MoviesChannel extends TvChannel{
    int additionalfee = 8;
    public MoviesChannel(String channelName, String language, String category, int price) {
        super(channelName, language, category, price);
    }
    @Override
    public int getPrice(){
        return super.getPrice() + additionalfee;
    }
}
