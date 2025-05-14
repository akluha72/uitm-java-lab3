
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

    @Override
    public double netAllowance() {
        double totalNetAllowance = 0;

        int typeA = 50;
        int typeB = 100;

        switch (typeService) {
            case 'A':
                totalNetAllowance = allowance + (numOfSession * typeA);
                break;
            case 'B':
                totalNetAllowance = allowance + (numOfSession * typeB);
                break;
            default:
                System.out.println("ERROR typeService is not valid");
                break;
        }
        // TODO - Start at rela calculation part
        return totalNetAllowance;

    }

}
