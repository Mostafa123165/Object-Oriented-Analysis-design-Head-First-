
package com.mycompany.project1;

/**
 *
 * @author Mostafa tarek
 */

public enum Type {
    
    ACOUSTIC , ELECTRIC ;
    
    public String toString() {
    
        switch (this) {
            case ACOUSTIC:
                return "Acoustic" ;
            case ELECTRIC : 
                return "Electric" ;
            default:
                return "UnExpected" ;
        }
      
    } 
  
}
