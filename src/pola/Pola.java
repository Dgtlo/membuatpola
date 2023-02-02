/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pola;

/**
 *
 * @author Lenovo
 */
public class Pola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
              if (i == 1 || i == 5 || i == 3 ) 
                System.out.print("* ");
               else if (i==2 && j==5) 
                System.out.print("* ");
                else if (i==4 && j==1) 
                System.out.print("* ");
                else
                System.out.print("  ");
              
            } 
          System.out.print(" ");         
          System.out.print("* ");
          System.out.print(" ");
              for(int j=1;j<=5;j++){
              if((i==1 || i==5) && j<5)
              System.out.print("* ");
              else if(i!=1 && i!=5 && (j==1 || j==5))
              System.out.print("* ");
                     else
              System.out.print("  ");
      
          }
            System.out.println();
          }
    }
    
}
