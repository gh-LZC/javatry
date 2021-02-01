package com.base.泛型genericity;

import lombok.Data;

@Data
public class Service{
   public String id;
   public String name;

   public Dpt deal(String t){
      Dpt o = new Dpt();
      if(t.equals(0)){
         return null;
      }else{
         o.setAmt("11");
         return o;
      }
   }

}
