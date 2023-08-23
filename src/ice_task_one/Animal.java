/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice_task_one;

import javax.swing.JOptionPane;

/**
 *
 * @author karan
 */
public class Animal {
    
    private int IDtag;
    private String  species ;

    public int getIDtag() {                            //varibles will be overided in the subclasses
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
        
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    //input and output methods with overide methods in the next classes 
    // might be needed 
        
    
    public void  input ()   // methods below will be overided in subclasses
    {
        setSpecies(JOptionPane.showInputDialog("Enter the spieces of the animal  "));
    }
    
    public void output()
    {
        // output fids
        System.out.println("This is the spieces : "+getSpecies());
    }
    
}
