package com.base.javaSymbol;

public abstract interface InterfaceTest {

     int a = 0;
     default void interfaceDefaultMethod(){};
     void interfaceMethod();
    void interfaceMethod2() throws Exception;
     static int b = 0;
     static void interfaceStaticMethod(){
         System.out.println("interfaceStaticMethod");
     };
     public static void main(String[] args){
         System.out.println(InterfaceTest.a);
         InterfaceTest.interfaceStaticMethod();
     }

     class ImplementsTest implements  InterfaceTest{
         @Override
         public void interfaceMethod() {

         }

         @Override
         public void interfaceMethod2() throws Exception {

         }
     }

     abstract class AbstractImplementsTest implements InterfaceTest{

     }

     class Extends extends AbstractImplementsTest{

         @Override
         public void interfaceMethod() {

         }

         @Override
         public void interfaceMethod2() throws Exception {

         }
     }
}
