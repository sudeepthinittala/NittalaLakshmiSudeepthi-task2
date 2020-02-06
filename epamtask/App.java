package com.epam.task2.epamtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class App{

    public static void main(String args[]){
        Gift gifts[]=new Gift[6];
        gifts[0]=new DarkChocolate(2,100);
        gifts[1]=new WhiteChocolate(4,300);
        gifts[2]=new Basindi(4,150);
        gifts[3]=new MalaiRoll(6,200);
        gifts[4]=new DarkChocolate(3,200);
        gifts[5]=new WhiteChocolate(4,50);
        for(int i=0;i<4;i++){
            if(gifts[i] instanceof Chocolate){
                System.out.println("Chocolates");
                if(gifts[i] instanceof DarkChocolate){
                    DarkChocolate d=(DarkChocolate) gifts[i];
                    d.getname();
                    System.out.println("Quantity:"+d.getQuantity());
                    System.out.println("Cost:"+d.getCost());
                }
                else{
                    WhiteChocolate w=(WhiteChocolate) gifts[i];
                    w.getname();
                    System.out.println("Quanity:"+w.getQuantity());
                    System.out.println("Cost:"+w.getCost());
                }
            }
            else{
                System.out.println("Sweets");
                if(gifts[i] instanceof MalaiRoll){
                    MalaiRoll m=(MalaiRoll) gifts[i];
                    m.getname();
                    System.out.println("Weight:"+m.getWeight());
                    System.out.println("Cost:"+m.getCost());
                }
                else{
                    Basindi b=(Basindi) gifts[i];
                    b.getname();
                    System.out.println("Weight:"+b.getWeight());
                    System.out.println("Cost:"+b.getCost());
                }
            }
        }
       ArrayList<Chocolate>arr=new ArrayList<Chocolate>();
       for(int i=0;i<6;i++) {
    	   if(gifts[i] instanceof Chocolate) {
    		   Chocolate c=(Chocolate)gifts[i];
    		   arr.add(c);
    	   }
       }
       Collections.sort(arr,new Comparator<Chocolate>(){
    	   public int compare(Chocolate a, Chocolate b) 
   	    { 
   	        return a.cost - b.cost; 
   	    } 
       });
       System.out.println("Sorted Values are:");
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i).getCost());
        }
        System.out.println("Total Weight:");
        int count=0;
        for(int i=0;i<6;i++) {
        	if(gifts[i] instanceof Chocolate) {
        		Chocolate c=(Chocolate)gifts[i];
        		count+=c.getQuantity();
        	}
        	if(gifts[i] instanceof Sweets) {
        		Sweets s=(Sweets)gifts[i];
        		count+=s.getWeight();
        	}
        }
        System.out.println(count+"kgs");
        int count1=0,count2=0;
        for(int i=0;i<arr.size();i++) {
        	if(arr.get(i).getCost() <=100) {
        		count1++;
        	}
        	else {
        		count2++;
        	}
        	
        }
        System.out.println("Less than 100rs:"+count1);
        System.out.println("More than 100rs:"+count2);
        
             
    }
    
}
