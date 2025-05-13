
public abstract class Volunteer {

    protected String id;
    protected String name;
    protected double allowance;
    protected int numOfSession;

    //default constructor
    public Volunteer() {
        this.id = "undefined";
        this.id = "undefined";
        this.allowance = 0.0;
        this.numOfSession = 0;
    }

    //normal constructor
    public Volunteer(String id, String name, double allowance, int numOfSessions) {
        this.id = id;
        this.name = name;
        this.allowance = allowance;
        this.numOfSession = numOfSessions;
    }

    //accessor method
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAllowance() {
        return allowance;
    }

    public int getNumOfSession() {
        return numOfSession;
    }

    @Override
    public String toString() {
        return "Volunteer ID: " + id
                + ", Name: " + name
                + ", Allowance: " + allowance
                + ", Sessions: " + numOfSession;
    }

    abstract double netAllowance();

}
