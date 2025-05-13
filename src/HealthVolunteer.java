
public class HealthVolunteer extends Volunteer {

    private char typeService;

    //default constructor
    public HealthVolunteer() {
        super();
        this.typeService = 'A';
    }

    //normal constructor
    public HealthVolunteer(String id, String name, double allowance, int numOfSession, char typeService) {
        super(id, name, allowance, numOfSession);
        this.typeService = typeService;
    }

    //accessor
    public char getTypeService() {
        return typeService;
    }

    //toStringMethod
    @Override
    public String toString() {
        return "Volunteer ID: " + id
                + ", Name: " + name
                + ", Allowance: " + allowance
                + ", Sessions: " + numOfSession
                + ", Type of Service: " + typeService;
    }

    public double netAllowance() {
        return 0;

    }

}
