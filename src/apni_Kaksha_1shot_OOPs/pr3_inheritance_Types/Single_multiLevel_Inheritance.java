package apni_Kaksha_1shot_OOPs.pr3_inheritance_Types;

class shape {

    public void area () {
        System.out.println("Displays the area of any perticular size");
    }
}


//this is the example of single and multilevel inheritances


class theTriangle extends shape {

    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

class EquilateralTriangle extends theTriangle {
    public void area(int l, int h) {
        System.out.println(.5 * l * h);
    }
}

class Circle extends shape{
    public void area (int r){
        System.out.println((3.14) *r * r);
    }
}



public class Single_multiLevel_Inheritance {
    public static void main (String args[] ){


    }
}
