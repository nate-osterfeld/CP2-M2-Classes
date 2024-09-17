import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public String getAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return String.valueOf(age);
    }

    public String getAge(int year) {
        int age = year - YOB;
        return String.valueOf(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + YOB +
                '}';
    }

    public String toCSV() {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title +
                ", " + this.YOB;
    }

    public String toJSON() {
        String retString = "";
        char DQ = '"'; // double quote

        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += DQ + "lastName" + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += DQ + "title" + DQ + ":" + DQ + this.title + DQ + ",";
        retString += DQ + "yob" + DQ + ":" + DQ + this.YOB + DQ + ",";

        return retString;
    }

    public String toXML() {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title>";
        retString += "<yob>" + this.YOB + "</yob>" + "</Person>";

        return retString;
    }
}
