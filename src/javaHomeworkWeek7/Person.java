package javaHomeworkWeek7;
//program to create different methods and calling them

public class Person {
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");// ""
        person.setLastName("");// ""
        person.setAge(10); //age 10
        System.out.println("fullName = " + person.getFullName());//""
        System.out.println("teen=" + person.isTeen());//false
        person.setFirstName("John");//john
        person.setAge(18);//18 false
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String fname) {
        firstName = fname;
        return firstName;
    }

    public String setLastName(String lname) {
        lastName = lname;
        return lastName;
    }

    public int setAge(int sage) {
        if (sage < 0 || sage > 100)
            age = 0;
        else
            age = sage;
        return age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20)
            return true;
        else
            return false;
    }

    public String getFullName() {
        String fullName;
        if (lastName.isEmpty()) {
            fullName = lastName;
        } else if (firstName.isEmpty() && lastName.isEmpty())
        {
            fullName = "";
        }
        if (firstName.isEmpty()) {
            fullName = firstName;
        } else
            fullName = (firstName.concat(lastName));


        return (fullName);
    }
}
