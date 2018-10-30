package com.example.enumapp;

interface Fee{
    public Yen yen();
    public String label();
}

class AdultFee implements Fee{
    public Yen yen(){
        return new Yen(100);
    }
    public String label(){
        return "Adult";
    }
}

class ChildFee implements Fee{
    public Yen yen(){
        return new Yen(50);
    }
    public String label(){
        return "Child";
    }
}

class SeniorFee implements Fee{
    public Yen yen(){
        return new Yen(80);
    }
    public String label(){
        return "Senior";
    }
}