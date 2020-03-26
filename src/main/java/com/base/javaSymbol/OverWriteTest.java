package com.base.javaSymbol;

/**
 * @class OverWriteTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/22 12:14
 * @Version 1.0
 */
public class OverWriteTest {
    class Father {
        public void fatherMethod0() { }
        public void fatherMethod1() throws ArithmeticException{ }
        public void fatherMethod2() throws RuntimeException {}
        public void fatherMethod3() throws Exception {}
    }

    class Childer extends Father {
        @Override
        public void fatherMethod0() {
            super.fatherMethod0();
        }

        /*@Override
        protected void fatherMethod() {
            super.fatherMethod();
        }*/

        /*@Override
        public void fatherMethod() throws Exception{
            super.fatherMethod();
        }*/

        @Override
        public void fatherMethod1() {
            super.fatherMethod1();
        }

        @Override
        public void fatherMethod2() throws IndexOutOfBoundsException, ArithmeticException {
            super.fatherMethod2();
        }

        @Override
        public void fatherMethod3() throws RuntimeException,Exception {
            super.fatherMethod3();
        }
    }

    public static void main(String[] args) {
       new OverWriteTest().new Childer().fatherMethod2();
    }
    /*
     * 重写 总结：
     *   1.发生在父类与子类之间
     *   2.方法名，参数列表，返回类型（除过子类中方法的返回类型是父类中返回类型的子类）必须相同
     *   3.访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private)
     *   4.重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常
     * */
}
