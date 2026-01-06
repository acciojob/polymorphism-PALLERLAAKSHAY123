package com.driver;

public class Main {
   public class Product{
     public int product(int x, int y) {
       return x*y;
     }
     public int product(int x, int y, int z) {
       return x*y*z;
     }
     public double product(double x, double y) {
       return x*y;
     }
     
   }
  Product p=new Product();
  p.product(3,4);
  p.product(2,4,6);
  p.product(2.5,5.5);
  
}
