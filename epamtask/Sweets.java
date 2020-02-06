package com.epam.task2.epamtask;

abstract class Sweets{
	public int weight;
    public int cost;
    Sweets(int weight,int cost){
        this.weight=weight;
        this.cost=cost;
    }
    abstract int getWeight();
}

