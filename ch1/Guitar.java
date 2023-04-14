
package com.mycompany.project1;

/**
 *
 * @author Mostafa Tarek
 */

public class Guitar {
    
    private String   serialNumber ; 
    private double   price ;
    private GuitarSpec Spec  ;
   
    public Guitar(String serialNumber , double price , GuitarSpec spec) {
        this.serialNumber = serialNumber ;
        this.price = price;
        this.Spec = spec ;
    }
        
    public void SetPrice(double price) {
        this.price = price;
    }
      
    public String getSerialNumber() {
       return serialNumber ;
    }
       
    public double getprice() {
       return price ;
    }
    
    public GuitarSpec getGuitarSpec() {
        return Spec ;
    }
    
}
