package anuj_1shot_OOPs.t2_Inheritance;

public class inheritance {
    public static void main(String[] args) {

        person p1 = new person(31,"rajesh ");
        p1.age=  32;
        p1.name = "raudiii";


        developer d1 = new developer(32 , "bhau fatkal");
        d1.walk();


    }
}
//extends means basically gives the property of person
// gives to developer so parent child relation here

class developer extends person{
public  developer(int age ,String name){
    super(age , name);
}
}

class person{
    String name;
    int  age;

    public  person() {
        System.out.println("this is inheritance ");
    }

    public person(int age , String name){
        this.name = name;
        this.age = age;
    }
        void walk(){
            System.out.println(name + " is walking on road.");
        }
}