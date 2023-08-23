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
public class Reptile extends Animal{
    
    
    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }
    
    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    
   //we use the overide to change methods that are from the parent class  and we change them to make use of them in the parent class
    // when we use extends in the header of a child class we can use the methods from the patent class
    // GET ID TAG AND GETSPICES ARE FROM THE PARENT CLASS 
    // we add super.()--to parent methods to tell the IDE that thoses methods are from the parent class(also known as the super class)

    @Override
    public void output() {
       // we remove the (Super.) beacause we are rewrtting this method to suit this child classes needs
       
        System.out.println("The ID TAG for reptile is : "+super.getIDtag()+"\nThe spieces  is : "+super.getSpecies()
                +"\nThe Blood tempreture of the reptile is : "+getBloodTemp()  +" Degrees");
        
    }

    @Override
    public void input() {
        
         int ID ;
        String Speices;
       double bloodtemp;
        
        Scanner kb = new Scanner(System.in); 
        
        System.out.println("Enter the ID TAG for the reptile >>>> ");
        ID=kb.nextInt();
        super.setIDtag(ID);
        
        System.out.println("Enter the spieces of the reptile>>>>");
        Speices=kb.next();
       super.setSpecies(Speices);
       
        System.out.println("Enter the blood tempreture of the reptile>>>>> ");
        bloodtemp=kb.nextDouble();
        setBloodTemp(bloodtemp);
        
    }
    
}
