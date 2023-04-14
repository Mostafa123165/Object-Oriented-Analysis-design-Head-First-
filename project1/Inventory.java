
package com.mycompany.project1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mostafa Tarek
 */

public class Inventory {
    
    private List guitars ; 

    public Inventory() {
        guitars = new LinkedList() ;
    }    
    
    public void addGuitar(String SerialNumber , Builder builder , String model , wood topWood , wood backWood , double price , Type type , int numStrings) {
        Guitar guitar = new Guitar(SerialNumber , price , new GuitarSpec(builder ,type , backWood , topWood , model ,numStrings));
        guitars.add(guitar) ;
    }
    
    public Guitar getGuitat(String SerialNumber) {
     
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            
            Guitar guitar = (Guitar) i.next() ;
            
            if(guitar.getSerialNumber().equals(SerialNumber) ){
                return  guitar ;
            }
        }
        return null ;
    }
        
    
    public List search(GuitarSpec searchGuitar) {
    
        List matchingGuitar = new LinkedList();
        
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            
            Guitar guitar = (Guitar) i.next();
           if(matches(guitar.getGuitarSpec() ,searchGuitar))matchingGuitar.add(guitar) ;
           
        }
        
       return matchingGuitar ; 
    }
    
    
    public boolean matches(GuitarSpec RockGuitar , GuitarSpec SearchGuitar) {
        
           String model = SearchGuitar.getmodel().toLowerCase() ;
       
           if(model != null && !model.equals("") && !RockGuitar.getmodel().toLowerCase().equals(model)) return false;

           if( RockGuitar.getbuilder() != SearchGuitar.getbuilder())      return false;
            
           if( RockGuitar.gettype()!= SearchGuitar.gettype())             return false;

           if(RockGuitar.gettopWood()!= SearchGuitar.gettopWood())        return false;

           if(RockGuitar.getbackWood()!= SearchGuitar.getbackWood())      return false;
            
           if(RockGuitar.getnumStrings()!= SearchGuitar.getnumStrings())  return false;

            return true ;
    }
        
    

}