package com.bridgLabz.oops;

public class ObjectPractice {
    public static void main(String[] args) {
      Animal a1=new Animal();
      a1.talking();
      a1.running();
      System.out.println("*********************************");
      
      Animal a2=new Dog();
      a2.talking();
      a2.running();
      System.out.println("*********************************");
      
      Animal a3=new Rabbit();
      a3.talking();
      a3.running();
      System.out.println("*********************************");
      
      Dog d1=new Dog();
      d1.talking();
      d1.running();
      System.out.println("*********************************");
      
      Rabbit r1=new Rabbit();
      r1.talking();
      r1.running();
      System.out.println("*********************************");

      Animal a4=new Dog();
      Dog d2=(Dog)a4;
      d2.talking();
      d2.running();
      System.out.println("*********************************");
      Rabbit r2=new Rabbit();
      Animal a=(Animal)r2;
      a.talking();
      a.running();
      
    //  Dog d=new Animal(); //cannot convert from Animal to Dog
    //  Dog d=new Rabbit(); //cannot convert from Rabbit to Dog
     
    // Rabbit r= new Dog();  // cannot convert from Dog to Rabbit
    // Rabbit r=new Animal(); //cannot convert from Animal to Rabbit
      
      
    }
}

class Animal{
	void talking() {
		System.out.println("Animals are talking ");
	}
	void running() {
		System.out.println("Animals are running ");
	}
}

class Dog extends Animal{
	void talking() {
		System.out.println("Dog is barking");
	}
	void running() {
		System.out.println("Dog is running");
	}
}

class Rabbit extends Animal {
	void talking() {
		System.out.println("Rabbit is talking ");
	}
	void running() {
		System.out.println("Rabbit is running");
	}
}
