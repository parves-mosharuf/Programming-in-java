package javaapplication11;


import java.util.Scanner;

public class JavaApplication11 {

  
    public static void main(String[] args) {
        
        
        Scanner parves = new Scanner (System.in);
        
        
      int x = parves.nextInt();
      
      
      switch (x%10){
          
          case 0:
              System.out.println ("even");
              
          break;
          
          case 1:
              System.out.println ("odd");
              
           break;
          default:
              System.out.println("invalid");
      }
        
    }
    
}
