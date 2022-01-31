package bank_and_AccessModifiers;

class  account{
    public String name;
    protected String email;

    private String password;


// getter and setters for access the private passwords | private classes
    public String getPassword() {

        return this.password ;
    }

    public void setPassword(String pass){
        this.password = pass ;
    }


}

public class bank {

    public static void main(String[] args) {

        account account1 = new account();
        account1.name = "ssvps collage";

        account1.email = "ssvps@gmail.com";
        account1.setPassword("gfg");
        System.out.println(account1.getPassword());
    }

}
