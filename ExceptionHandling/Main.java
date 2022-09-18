package com.OOProgramming.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            //int c = a/ b;
//            divide(a,b);
            // mimicing
//            throw new Exception("Normal exception");

            String name = "Ammu";
            if(name.equals("Ammu")) {
                throw new MyException("Name is Ammu");
            }
        } catch (ArithmeticException e) {  // more strict should come first
            System.out.println(e.getMessage());
        } catch (Exception e) {   // bcoz Exception having all other exceptions in it
            System.out.println(e.getMessage()); // print the message same for Exception and ArithmeticException
        } finally {  // optional and only one finally is allowed
            System.out.println("This will always execute");
        }
    }

    static  int divide ( int a,int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("Please don't divide by zero"); // didn't execute catch
        }

        return a / b;
    }
}
