/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author karan
 */
public class ICE_Task_ONE {

    /**
     * @param args the command line arguments
     */
    
    //ST10256361-PROG6112-
    //Full name : Karan Moodley 
    
     //The referances used
        
 // https://www.youtube.com/watch?v=cCgOESMQe44
//https://www.youtube.com/watch?v=L1htVG3xP5Y
//https://www.youtube.com/watch?v=j0lBrYSlYaU
//https://www.youtube.com/watch?v=d08oJlwVgyo&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=17
//https://www.youtube.com/watch?v=6wVmqY-CrGM
//https://www.youtube.com/watch?v=Mm06BuD3PlY
    
    public static void main(String[] args) {
        // TODO code application logic here
        
                    // Now we call the constuctors // which mean we creating the objects for the classes
                    Bird brd = new Bird();
                    Reptile rept = new Reptile();
                    
                    int choice ;
                    int DESCsion;
                    boolean flag=false;
                    Scanner kb = new Scanner(System.in);
                    
                    System.out.println("");
                     System.out.println("Enter 1 for birds or enter 2 for reptiles>>>>>>>>");
                     choice=kb.nextInt();
                  
               while (flag!=true)
               {   
                     switch (choice)
                     {
                         case 1 :  
                             System.out.println("----------Bird----------");
                             brd.input();         // methods to input and colour of feathers and last method for output 
                             brd.Feathers();
                             System.out.println("");
                             brd.output();
                             System.out.println("");
                             
                             break;
                             
                         case 2: 
                             
                              System.out.println("----------Reptile----------");
                             rept.input();
                             System.out.println(" ");
                             rept.output();
                             System.out.println("  ");
                          break;
                             
                           
                        }// end Swicth case 
                    System.out.println(""); 
                     System.out.println("Do you want to enter another animal again \n Enter 1 for yes \n Enter 2 for no ");
                     DESCsion=kb.nextInt();
                     
                     if (DESCsion==1)
                     {
                          System.out.flush();
                          flag=false;
                          System.out.println("Enter 1 for birds or enter 2 for reptiles>>>>>>>>");
                          choice=kb.nextInt();
                          
                   }else{
                         
                         flag=true;
                         
                     }// end if 
                   
                  
               }//End of while loop   
               
               System.out.println(" Thank for using details recorder");
               
                 // .super adds the old functionallity     
                     
    }// main 
    
    // method calls 
    
 
    
}
