package com.javatechie.aws.cicd.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Order {

    private int id;
    private String name;
    private int quantity;
    private long price;
   
   @Override
   public String toString(){//overriding the toString() method  
    return id+" "+name+" "+quantity;  
    }  
}
