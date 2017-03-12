package com.design.patterns;

public abstract class Vehicle {
  public Vehicle() 
  {
  }
  
  //am had to add this method!
  public void setGoAlgorithm(GoAlgorithm a) {
	// TODO Auto-generated method stub
	a.go();
  }
  
  public void go(){
    System.out.println("I'm driving.....");
  }
}


