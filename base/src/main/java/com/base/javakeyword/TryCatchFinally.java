package com.base.javakeyword;

/**
 * @class TryCatchFinally
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/20 23:00
 * @Version 1.0
 */
public class TryCatchFinally {
    public static void main(String[] args) throws Exception {
        new TryCatchFinally().demo3();
    }

    public void demo2()  {
        System.out.println(demo21());
    }

    public  String demo21() {
        try {
            System.out.println("try block");
            return demo22();
        } finally {
            System.out.println("finally block");
        }
    }

    public static String demo22() {
        System.out.println("return statement");
        return "after return";
    }

    public void demo3()  {

        System.out.println(demo31());
    }


    public  int demo31() {
        int b = 20;

        try {
            System.out.println("try block");

            return b += 80;
        } catch (Exception e) {

            System.out.println("catch block");
        } finally {

            System.out.println("finally block");

            if (b > 25) {
                System.out.println("b>25, b = " + b);
            }

            return 200;
        }
    }



    public void demo1(){
        Object o = null;
        o.equals("");
        try{
            System.out.println("try");
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }
}


/**
 * 1.try,catch,finally当异常在try外面就捕获不了见--demo1
 * 2.finally块的语句在try或catch中的return语句执行之后返回之前执行且finally里的修改语句可能影响也可能不影响try或catch中 return已经确定的返回值，
 * 若finally里也有return语句则覆盖try或catch中的return语句直接返回。见--demo2好demo3
 */
