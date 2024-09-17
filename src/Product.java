public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;

    // constructor
    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getID() {
        return ID;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public String toCSV() { // name description, cost
        return this.ID + ", " + this.description + ", " + this.cost;
    }

    public String toJSON() {
        String retString = "";
        char DQ = '"'; // double quote

        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "description" + DQ + ":" + DQ + this.description + DQ + ",";
        retString += DQ + "cost" + DQ + ":" + DQ + this.cost + DQ + ",";

        return retString;
    }

    public String toXML() {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<description>" + this.description + "</description>";
        retString += "<cost>" + this.cost + "</cost>";

        return retString;
    }
}
