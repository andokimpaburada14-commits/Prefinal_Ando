/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andoprefinal;

/**
 *
 * @author User
 */
public class QuickSort {
    
  private String productId;
  private String name;
  private  String category;
  private String quantity;
    
    

public void product (String productId,
String name,String category,String quantity){



this.productId = productId;
this.name = name;
this.category = category;
this.quantity = quantity;


  }
public String getproductId(){
    return name;
}

public String getname(){
    return category;
}
public String getcategory(){
    return quantity;
}
public String getQuantity(){
    return quantity;
}
public String toString(){
    return productId + " | " + name + "|" +category + "| Quantity: "+
            quantity;
}
}

