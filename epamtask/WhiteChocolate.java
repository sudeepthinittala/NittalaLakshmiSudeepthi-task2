package com.epam.task2.epamtask;

class WhiteChocolate extends Chocolate implements Gift{
WhiteChocolate(int quantity,int cost){
		   super(quantity,cost);
	   }
    public void getname(){
        System.out.println("This is WhiteChocolate");
    }
    int getQuantity(){
        return this.quantity;
    }
    public int getCost(){
        return this.cost;
    }
} 
