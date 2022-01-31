package apni_Kaksha_1shot_OOPs.pr4_abstraction;


interface twowheeler {
    int wheels  = 4;
    void run();
}

interface super_bike {

}

class student {
    String name;

//  note: static means we can directly access the class trough this
    static String school ;

    public static void changeSchool() {
        school = "newSchool";
    }


}


//note : this is the best example of multiple inheritance
// that implements the  both classes properties

class ducatti implements twowheeler , super_bike {
    public void run() {
        System.out.println("runs very fast cause it is superBike.");
    }
}

public class interfaces {
    public static void main(String[] args) {
        student.school = "jai_hind";

        student student1 = new student();
        student1.name = "Rocky";
        System.out.println(student1.school);
    }
}
