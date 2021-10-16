package com.example.dinnerAPI.model;

public class Admin {
    public void approvesDiningReview(Dining dining ){
        dining.status = Status.APROVED;
    }
}
