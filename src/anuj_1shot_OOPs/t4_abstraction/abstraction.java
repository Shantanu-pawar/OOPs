package anuj_1shot_OOPs.t4_abstraction;

public class abstraction {
    public static void main(String[] args) {

mustang m1 = new mustang();
m1.start();

Porsche p1 = new Porsche();
p1.start();

    }
}

class Porsche extends car{


    @Override
    void start() {
        System.out.println(" porsche is about to start");
    }
}

class mustang extends car{


    @Override
    void start() {
        System.out.println("Mustang starts lol");
    }
}


abstract class car{
    int price;
   abstract void start();
}
