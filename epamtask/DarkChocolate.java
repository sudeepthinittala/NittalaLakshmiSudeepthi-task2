package com.epam.task2.epamtask;

class DarkChocolate extends Chocolate implements Gift{
	   DarkChocolate(int quantity,int cost){
		   super(quantity,cost);
	   }
	    public void getname(){
	        System.out.println("This is DarkChocolate");
	    }
	    int getQuantity(){
	    return this.quantity;
	    }
	    public int getCost(){
	        return this.cost;
	    }
	}