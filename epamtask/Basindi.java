package com.epam.task2.epamtask;

class Basindi extends Sweets implements Gift{
	Basindi(int weight,int cost){
		   super(weight,cost);
	   }
   
    public void getname(){
        System.out.println("This is Basindi");
    }
    int getWeight(){
        return this.weight;
    }
    public int getCost(){
        return this.cost;
    }
}