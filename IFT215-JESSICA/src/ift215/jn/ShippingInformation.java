
package ift215.jn;


@SuppressWarnings("empty-statement")
public class ShippingInformation {
    
    private String name;
    private int country;
    private String address;
    private boolean cash;
    private boolean card;
    private String shippingInformation;
    
  
    
    public ShippingInformation (String name, int country, String address){
        
        this.name=name; 
        this.country=country;
        this.address=address;
        
    }

    ShippingInformation(int country, String name, String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public int getCountry(){
        return country;
    }
    
    public void setCountry(int country){
        this.country=country;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public boolean getCash(){
        return cash;
    }
    
    public void setCash(boolean cash){
        this.cash=cash;
    }
    
    public boolean getCard(){
        return card;
    }
    
    public void setCard(boolean card){
        this.card=card;
    }
    
      
     public String getShippingInformation(){
        String shippinhInformation;
        
        shippingInformation=" A buyer name "+name
                 +" from "+country;
        if(cash==true){
            shippingInformation+=" (Cash) ";
        }         
        shippingInformation+=" address at "+address;  
                
        return shippingInformation;
    }
    
      
}


