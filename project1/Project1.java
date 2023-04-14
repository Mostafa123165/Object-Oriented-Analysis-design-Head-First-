
package com.mycompany.project1;

import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Mostafa Tarek 
 */
public class Project1 {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory(); 
        initializeInventory(inventory) ;
        
       GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, Type.ELECTRIC, wood.ALDER,wood.ALDER, "Stratocastor",10);
        List matchingGuitars = inventory.search(whatErinLikes); 
        if(!matchingGuitars.isEmpty()){
            System.out.println(" good, Erin, we have guitar for you. ");
            
           for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next() ;
                GuitarSpec Spec = guitar.getGuitarSpec() ;
                System.out.println(" We have a " +
                Spec.getbuilder()+ " " + Spec.getmodel()+ " " +
                Spec.gettype()+ " guitar:\n " +        
                Spec.getbackWood()+ " back and sides,\n " +
                Spec.gettopWood()+ " top.\n You can have it for only $" +
                guitar.getprice()+ " numsStrings : "+ guitar.getGuitarSpec().getnumStrings()+ "!\n ----") ;
            }
        }
        else {
        System.out.println(" Sorry, Erin, we have nothing for you. ");
        }
        
    }
    
   private static void initializeInventory(Inventory inventory) {
         inventory.addGuitar("00vvf", Builder.FENDER, "Stratocastor", wood.ALDER, wood.ALDER, 140, Type.ELECTRIC,10);
         inventory.addGuitar("00vvfaa", Builder.FENDER, "Stratocastor", wood.ALDER, wood.ALDER, 140, Type.ELECTRIC,10);

 }
}

