package com.base.javakeyword;

/**
 * 1.final修饰的成员属性，需要使用时候初始化。
 * 2.初始化后，不能修改值。
 * 3.final初始化途径：在声明处、在构造方法、在块
 *
 */
public  class FinalTest {
    final String finalString;
    final int finalInt;
    final char finalChar;
    final boolean finalBoolean;
   /* static final String finalStringS;
    static final int finalIntS;
    static final char finalCharS;
    static final boolean finalBooleanS;*/

   /*{
       finalString = "";
       finalInt = 1;
       finalChar = 'b';
       finalBoolean = false;
   }*/

   public FinalTest(String finalString, int finalInt, char finalChar, boolean finalBoolean) {
        this.finalString = finalString;
        this.finalInt = finalInt;
        this.finalChar = finalChar;
        this.finalBoolean = finalBoolean;
    }
    //导致报错，少初始化其他final属性
    /*public FinalTest(String finalString, int finalInt) {
        this.finalString = finalString;
        this.finalInt = finalInt;

    }*/

    public static void main(String[] args){
        FinalC finalC = new FinalC();
        finalC = new FinalC();
        final FinalC finalCc = new FinalC();
        //finalCc = new FinalC();
    }

    /*public FinalTest() {
        //finalMethod();
        this.finalString = "";
        this.finalInt = 0;
        this.finalChar = 'a';
        this.finalBoolean = true;
    }*/

    void method() {
        //不能初始化
        //finalBoolean = true;
    }

    final void finalMethod() {
        //不能初始化
        //finalBoolean = true;
    }

    private final void finalMethod2(){

    }


    class InnerC extends FinalTest {
/* 父类final方法不能被重写
        void finalMethod(){

        }*/


        void Method(final String a){
            //final参数不能被修改
            //a="b";
        }

        void finalMethod2(){

        }

        public InnerC(String finalString, int finalInt, char finalChar, boolean finalBoolean) {
            super(finalString, finalInt, finalChar, finalBoolean);
        }
    }


}

final class FinalC{ }
//错误：final类不能被继承，不能继承
//class ClassC extends FinalC{}
