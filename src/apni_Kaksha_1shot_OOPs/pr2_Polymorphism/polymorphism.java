package apni_Kaksha_1shot_OOPs.pr2_Polymorphism;
 /*

        in this we see how polymorphism works
        we look methods over_loading and over_riding

         */

 class polymorphism {

    public static void main(String[] args) {

            car c1 = new car();
            c1.name = " Mustang ";
            c1.carsNumberPlate = 3333 ;

//            this can print both cars number and cars name
       c1.carInfo(c1.carsNumberPlate, c1.name);

//       if we have to print separately the cars number so this gives me output
       c1.carInfo(c1.carsNumberPlate);


    }
}


class car {

    String name ;
    int carsNumberPlate;


    public void carInfo(String name){
        System.out.println(name);
    }

    public void carInfo(int carsNumberPlate){
        System.out.println(carsNumberPlate);
    }

    public void carInfo(int carsNumberPlate, String name){
        System.out.println(carsNumberPlate  + " " + name);
    }


}
