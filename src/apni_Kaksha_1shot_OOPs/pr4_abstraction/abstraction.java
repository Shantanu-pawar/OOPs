package apni_Kaksha_1shot_OOPs.pr4_abstraction;


abstract class animal {

     abstract void walk ();
     animal () {  //creating the constructor
         System.out.println("You are creating a new animal.");
     }
      public void eat () {
          System.out.println("animal eats.");
      }

}

class horse extends animal {
//    here we just use the constructor for making the objects
    horse(){
        System.out.println("created an horse");
    }
    public void walk() {
        System.out.println("walk on 4 legs.");
    }
}

class Chicken extends animal{
    public void walk() {
        System.out.println("walks on 2 legs.");
    }
}




public class abstraction {
    public static void main(String[] args) {
        horse horse = new horse();
//        horse.walk();
//        horse.eat();

/*
        this is only the abstract class so it give us runtime error;

                animal animal = new animal();
                animal.walk();


 */

    }
}
