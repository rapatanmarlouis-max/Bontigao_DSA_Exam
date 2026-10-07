/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CL-3
 */
public class productid {
    public String name;
    public String product;
    public String category;
    public String quantity;
    private String productid;
   

    public productid(String name, String category, String quantity, String product ) {
        this.name = name;
        this.product = product;
        this.category = category;
        this.quantity = quantity;
        
      
       
    }
    
    public String  getproductid() { return productid;}
    public String getName () { return name;}
    public String getCategory() { return category;}
    public String getQuantity () { return quantity;}
    public String getProductid() { return productid;}
    
    @Override
    public String toString () {
        return "id:" + productid + " :Name: " + name + " category: " + category + " Quantity : " + quantity;  
    }
    
}