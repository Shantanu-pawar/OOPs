package anuj_1shot_OOPs.t5_Interfaces;

public class interfaces implements car {
    public static void main(String[] args) {



    }

    @Override
    public void start() {
        System.out.println(" My car is about to Start");
    }
}
 interface car{
    void start();
//    interface don't required body cause it by default abstract

 }