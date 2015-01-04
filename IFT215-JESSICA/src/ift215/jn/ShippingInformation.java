
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
    

    public String getInvoice(){
        String invoice;
        
        shippingInformation="       "+name;
        
        shippingInformation="    "+country;

        if(cash==true){
            shippingInformation+="      ";
        }         
        shippingInformation=("    ");
        
        shippingInformation+="        "
                +address;
        
        return shippingInformation;
    }
      
}