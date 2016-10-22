package com.android.swapnil.ordermgmttestapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by swapnil on 22/10/2016.
 */

public class OrderMgmtModel {

    private String orderId;
    private String name;
    private String address;
    private Date etaDate;
    private int orderStatus;
    private ArrayList<OrderedListItems> orderedItems;

    public OrderMgmtModel(String orderId, String name, String address, Date etaDate, int orderStatus, ArrayList<OrderedListItems> orderedItems) {
        this.orderId = orderId;
        this.name = name;
        this.address = address;
        this.etaDate = etaDate;
        this.orderStatus = orderStatus;
        this.orderedItems = orderedItems;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEtaDate() {
        return etaDate;
    }

    public void setEtaDate(Date etaDate) {
        this.etaDate = etaDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ArrayList<OrderedListItems> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(ArrayList<OrderedListItems> orderedItems) {
        this.orderedItems = orderedItems;
    }
}
