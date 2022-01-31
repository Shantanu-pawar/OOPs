package apni_Kaksha_1shot_OOPs.pr1_basic_Java_OOPs;



class basic {
    public static void main(String[] args) {

//        this is function to print the pen information

        {
            pen pen_ballpen = new pen();
            pen_ballpen.color = "red";
            pen_ballpen.type = "elclusive writing fine finish ";

//            pen_ballpen.write();

            pen pen2 = new pen();
            pen2.color = "  black";
            pen2.type = "smoothing pen";

            // this is for printing the color

//            pen2.printColor();

        }


//        this is function is to print the student information
            {

            student student1 = new student();
            student1.name = "raja";
            student1.rollNum = 1;

//        System.out.println(student);
                student1.study();


                    }
    }
}


class student {

    String name ;
    int rollNum ;


    public void study (){
        System.out.println(this.name);
        System.out.println(this.rollNum);

    }

    //        type 1st constructor : non parametarised constructor

    student() {
        System.out.println("constructor called from this line");
    }




}

class pen{

    String color;
    String type ; // like ball or jel pen

    public void write () {
        System.out.println(" write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}