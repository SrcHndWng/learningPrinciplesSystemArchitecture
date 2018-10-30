package com.example.enumapp;

enum FeeType{
    adult(new AdultFee()),
    child(new ChildFee()),
    senior(new SeniorFee());

    private Fee fee;

    private FeeType(Fee fee){
        this.fee = fee;
    }

    public Fee fee(){
        return fee;
    }

    public Yen yen(){
        return fee.yen();
    }

    public String lable(){
        return fee.label();
    }
}
