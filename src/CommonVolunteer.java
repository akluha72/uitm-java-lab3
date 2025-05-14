
public class CommonVolunteer extends Volunteer {

    private boolean isRELA;

    //default constructors
    public CommonVolunteer() {
        super();
        this.isRELA = false;
    }

    //normal constructors
    public CommonVolunteer(String id, String name, double allowance, int numOfSessions, boolean isRELA) {
        super(id, name, allowance, numOfSessions);
        this.isRELA = isRELA;
    }

    //accessor
    public boolean getIsRELA() {
        return isRELA;
    }

    @Override
    public String toString() {
        return "Volunteer ID: " + id
                + ", Name: " + name
                + ", Allowance: " + allowance
                + ", Sessions: " + numOfSession
                + ", IsRELA: " + isRELA;
    }

    //toString();
    public double netAllowance() {
        double totalNetAllowance = 0;

        if(isRELA) {
            totalNetAllowance = allowance + (numOfSession * 0.10 * allowance);
        } else if(!isRELA) {
            totalNetAllowance = allowance * numOfSession;
        }

        return totalNetAllowance;
    }

}
