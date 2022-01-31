package anuj_1shot_OOPs.t1_Basics;

//        always keep in mind that in one public class
//        there is only one MainClass present
//        but we can create different type of classes

public class mainClass {
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 24 ;
        p1.name = "shantanu";

        person p2 = new person(31 ,"bhauto raju");
        p2.age = 54 ;
        p2.name = "raju";

//        System.out.println(p1.age + " " + p1.name);
//        System.out.println(p2.age + " " + p2.name);

//        p1.ride();
        p2.walk(5); // here we can insert the steps
        p2.walk();
        // this is compiled type of polymorphism and
        System.out.println(person.count);

    }
}

class person {
    String name;
    int age;

    static int count ;// this is for measure the persons

        public person () {
        count ++ ;
        System.out.println("Creating an object ");
    } // this is constructor,

        public person(int newAge , String name){
            this(); // basically this constructor is called the previous one

            this.name = name;
//            it simply means put the name in this classes name!
            this.age = newAge;
//            after using this. in same same type of another constructor
//            then it is creates overloading of constructors

        }

    void walk(){
        System.out.println(name + " is walking.");
    }

    void ride(){
        System.out.println(name + " is riding bike.");
    }

//    here steps is arguments that we entered
    void walk(int steps ){
        System.out.println(name + " walked " + steps + " steps.");

    }
    }
