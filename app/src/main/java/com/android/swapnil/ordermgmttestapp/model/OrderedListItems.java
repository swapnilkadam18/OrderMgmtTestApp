package com.android.swapnil.ordermgmttestapp.model;

/**
 * Created by swapnil on 22/10/2016.
 */

public class OrderedListItems {
    private String skuId;
    private int numOfItems;
    private int price;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
