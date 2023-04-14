
package com.mycompany.project1;

/**
 *
 * @author Mostafa tarek
 */

public enum wood {
     INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
     MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
     
     public String toString() {
         switch (this) {
           case ADIRONDACK :
                return "Adirondack"         ;
            case ALDER :
                return "Alder"              ;    
            case BRAZILIAN_ROSEWOOD :
                return "Brazilian_Rosewoos" ;
            case CEDAR :
                return "Cedar"              ;
            case COCOBOLO :  
                return "Cocobolo"           ;    
            case INDIAN_ROSEWOOD :
                return "Indian_Rosewood"    ;  
            case MAHOGANY :
                return "Mahogany"           ;
            case MAPLE :
                return "Maple"              ;
            case SITKA :
                return "Sitka"              ;  
            default:
                return "UnExpectedWood"     ;     
         }
     }
}
