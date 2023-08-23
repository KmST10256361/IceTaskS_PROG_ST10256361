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
public class Bird extends Animal {
    
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        
    }
    
    
    public  void Feathers ()
    {
        Scanner kb = new Scanner(System.in);
       Integer  FeatherCHOI;
        System.out.println("Please read below and choose what colour feathers the bird has ");
        System.out.println("Enter 1 for grey feathers or 2 for white feathers or 3 for black feathers>>> ");
        FeatherCHOI=kb.nextInt();
        
        switch(FeatherCHOI)
        {
            case 1:  setColour("Grey");  break;
            case 2 : setColour("White");   break ;
            case 3 : setColour("Black ");      break ;
        }// end of switch case 
    }// end of finding colour method // end of finding colour method 
   

    @Override
    public void output() {
        System.out.println("The ID TAG for bird is : "+super.getIDtag()+"\nThe spieces is : "+super.getSpecies()+"\nThe feather colour of the bird is: "+getColour());
    }

    @Override
    public void input() {
             int ID ;
        String Speices;
        
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter the ID tag for the bird >>>> ");
        ID=kb.nextInt();
        super.setIDtag(ID); // we are using a method in the PARENT CLASS (Also know as the super class)
                                        //We use the super. beacuse the method is from the super class which is the parent class
        
        System.out.println("Enter what type of spieces the bird is >>>>>");
        Speices=kb.next();
       super. setSpecies(Speices);
        
    }
    
    
  
}
