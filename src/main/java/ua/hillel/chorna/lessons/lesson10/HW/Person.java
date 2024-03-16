package ua.hillel.chorna.lessons.lesson10.HW;

public class Person {
    String firstName;
    String lastName;
    String city;
    long phone;
    public Person(String firstName, String lastName, String city, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phoneNumber;
    }
    public String personInfo() {
        return "You can call " + firstName + " " + lastName + " from " + city + " at " + phone + ".";
    }
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", 2936729462846L);
        Person person2 = new Person("Jackie", "Chan", "Shanghai", 12312412412L);
        Person person3 = new Person("Sherlock", "Holmes", "London", 37742123513L);

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}