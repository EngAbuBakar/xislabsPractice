package LambdaPractice;

public class LamdaExpression {
    public static void main(String[] args) {

        // seperate class to implement the interface

         //        InformationImple informationImple = new InformationImple();
         //        informationImple.saySomething();


        //this is annonymous class to implement the interface
        Information info=new Information() {
            @Override
            public void saySomething() {
                System.out.println("file is invoked");
            }
        };
        info.saySomething();

        //lambda expression to implement the interface
        Information information=()->
        {
            System.out.println(" SaySomething creating from lambda");
        };
        information.saySomething();

        SumInter sumInter=( a, b)->
        {
            return a+b;
        };
        System.out.println(sumInter.sum(3,5));
        System.out.println(sumInter.sum(22,44));


        //lambda function for area calculation

        CalculateArea calculateArea=(a,b)->{
            return a*b;

        };
        System.out.println("The area of the rectangle is: "+calculateArea.area(2.43,3.4));


    }

}
