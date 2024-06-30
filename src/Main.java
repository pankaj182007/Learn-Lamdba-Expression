import functionalInterface.LengthInter;
import functionalInterface.MyInterFace;
import functionalInterface.MyInterImpls;
import functionalInterface.SumInter;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

//Implementing without Lambda Expression
        MyInterFace myInterFace=new MyInterImpls();
        myInterFace.sayHello();

//Implementing using Anonymous class
        MyInterFace myInterFace1 =new MyInterFace() {
            @Override
            public void sayHello() {

            System.out.println("Hello from Anonymous class 1");}
        };
        myInterFace1.sayHello();

        MyInterFace myInterFace2 = new MyInterFace() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous class 2");

            }
        };
        myInterFace2.sayHello();

// Using Lambda expression
          MyInterFace myInterFace3=() -> {
              System.out.println("Hello from Lambda Expression");
          };

          myInterFace3.sayHello();

        // Using Lambda expression implements Suminter interface
        SumInter sumInter=(a, b) -> {

           return a+b;
        };

        System.out.print("To addition of two number \n enter value of  A = ");
        int a=scanner.nextInt();
        System.out.print("\nenter value of  B = ");
        int b=scanner.nextInt();
        System.out.println("Sum of "+a+" and "+b+" = "+ sumInter.sum(a,b));

       // Using Lambda expression implements LengthInter interface
        LengthInter lengthInter=(s)->s.length();
        System.out.print("Enter a String to find its length :");
        String s=scanner.next();
        System.out.println("Length of "+s+" is "+ lengthInter.getStringLength(s) );

          }

    }
