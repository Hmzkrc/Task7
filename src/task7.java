import java.util.Scanner;

class Person{
    protected String surname, firstName, street, zipCode, city;

    public void initiliaze() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
        surname = scanner.nextLine();
        System.out.println("Enter Surname");
        firstName = scanner.nextLine();
        System.out.println("Enter Street");
        street = scanner.nextLine();
        System.out.println("Enter Zip Code");
        zipCode = scanner.nextLine();
        System.out.println("Enter City");
        city = scanner.nextLine();
    }

    public void print(){

        System.out.println("Surname" + surname);
        System.out.println("Name" + firstName);
        System.out.println("Street" + street);
        System.out.println("Zip Code" + zipCode);
        System.out.println("City" + city);










    }
}

class Staff extends Person {

    private String education, position;

    public void initialize() {

        super.initiliaze();


        Scanner scanner = new Scanner(System.in);
      System.out.println("Enter education");
      education = scanner.nextLine();
      System.out.println("Enter Position");
      position = scanner.nextLine();





    }

    public void print() {


        super.print();

        System.out.println("Education" + education);
        System.out.println("Position" + position);





    }











}



