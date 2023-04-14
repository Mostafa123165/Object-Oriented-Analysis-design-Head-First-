
package com.mycompany.project1;

/**
 *
 * @author Mostafa Tarek
 */
public class GuitarSpec {
    
    private Builder  builder ;
    private Type     type ;
    private wood     backWood , topWood;
    private String   model ;
    private int numStrings ;
    
    
    public GuitarSpec(Builder builder, Type type, wood backWood,wood topWood ,String Model , int numStrings) {
      this.builder  = builder ;
      this.type     = type ;
      this.backWood = backWood ;
      this.topWood  = topWood ;
      this.model    = Model ;
      this.numStrings = numStrings ;
    };
    
    public Builder getbuilder() {
      return builder ;
    }
    public Type gettype() {
      return type ;
    }
    
    public wood getbackWood() {
      return backWood ;
    }
    
    public wood gettopWood() {
      return topWood ;
    }
    
    public String getmodel() {
       return model ;
    }
    public int getnumStrings() {
       return numStrings ;
    }
    
}
