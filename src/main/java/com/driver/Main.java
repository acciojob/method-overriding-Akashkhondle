package com.driver;

public class Main {
    public static void main(String[] args){
        A x = new B();
        System.out.print(x.meth());
    }

    public static class A{
        String meth()
        {
            return "Invoking method from class A";
        }
    }

   public static class B extends  A
    {
        String meth()
        {
            return "Method is overridden in Extendend class B";
        }
    }
}