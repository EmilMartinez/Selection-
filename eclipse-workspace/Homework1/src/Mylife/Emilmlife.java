package Mylife;

public class Emilmlife {
 
 public String career;
 public double rich;
 public int age;
 public char belive;
 
 public String Desires (String career) {
   this.career = career; 
   System.out.println("I am a: " + career);
   return career;
 }
 
 
 
 public double Desires (double rich) {
   this.rich = rich; 
   System.out.println("I will make in thousands:" + rich );
   return rich;
 }
 
 public char Desires (char belive) {
	 this.belive = belive;
	 System.out.println("Do you belive:" +belive);
	 return belive;
 }
 
 public int Desires (int age) {
	 this.age = age; 
	 System.out.println("The age when I want to earn 100k: " +age);
	 return age;
 }
  
 }
 
 

