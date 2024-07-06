package mypackage;
//Inheritance program
//can inherits static and non static method
//constructor can be inherited in java
class parents//this is the parent class
{
	parents() 
	{
		System.out.println("parent calss");
	}
}

public class Inheritance extends parents//this is the child class
{
	Inheritance()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Inheritance c1=new Inheritance();
	}

}
