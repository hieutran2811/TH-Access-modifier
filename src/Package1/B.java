package Package1;

import AccessModifier.A;

class B extends A {
    public static void main(String args[]){

        B obj = new B();//Compile Time Error

        obj.msg();//Compile Time Error
    }
}