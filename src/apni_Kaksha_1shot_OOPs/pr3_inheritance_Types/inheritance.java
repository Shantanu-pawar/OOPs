package apni_Kaksha_1shot_OOPs.pr3_inheritance_Types;



    /*
    basically it is used when we have to transfer 1class property
    towards another class

    inheritance is improve the re usability of code
     */

    class Shape{
        String color ;
    }
    class Triangle extends Shape{

    }


public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue hot ";

        System.out.println(t1.color);
    }



}
