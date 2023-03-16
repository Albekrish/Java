package com.expensemanagement.dto;

public class Expense {
    private String date;
    private String details;
    private float amount;
    
    public Expense(String date,String details, float amount) {
        //super();        
        this.date = date;
        this.details = details;
        this.amount = amount;
    } 
 
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }         
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String toString(){
        return date+";"+details+";"+amount;
    }
}
