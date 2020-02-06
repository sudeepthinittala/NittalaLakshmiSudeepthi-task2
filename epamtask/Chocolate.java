package com.epam.task2.epamtask;

abstract class Chocolate{
	 public int quantity;
	 public  int cost;
	 Chocolate(int quantity,int cost){
	        this.quantity=quantity;
	        this.cost=cost;
	    }
  abstract int getQuantity();
  abstract int getCost();

}
