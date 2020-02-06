package com.epam.task2.epamtask;

class MalaiRoll extends Sweets implements Gift{
	  
	MalaiRoll(int weight,int cost){
		   super(weight,cost);
	   }
    public void getname(){
        System.out.println("This is MalaiRoll");
    }
    int getWeight(){
       return this.weight;
    }
    public int getCost(){
        return this.cost;
    }
}
