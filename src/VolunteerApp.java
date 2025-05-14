
import java.util.Scanner;

public class VolunteerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of volunteer");

        // int size = sc.nextInt();
        // Volunteer[] vlt = new Volunteer[size];
        // for (int i = 0; i < size; i++) {
        //     System.out.println("\nVolunteer #" + (i + 1));
        //     System.out.print("Enter type (1=Common, 2=Health): ");
        //     int type = sc.nextInt();
        //     System.out.print("ID: ");
        //     String id = sc.next();
        //     System.out.print("Name: ");
        //     String name = sc.next();
        //     System.out.print("Allowance: ");
        //     double allowance = sc.nextDouble();
        //     System.out.print("Number of Sessions: ");
        //     int sessions = sc.nextInt();
        //     if (type == 1) {
        //         System.out.println("is the volunteer is RELA? (true/false): ");
        //         boolean isRELA = sc.nextBoolean();
        //         vlt[i] = new CommonVolunteer(id, name, allowance, sessions, isRELA);
        //     } else if (type == 2) {
        //         System.out.println("Type of Service (A/B): ");
        //         char typeService = sc.next().toUpperCase().charAt(0);
        //         vlt[i] = new HealthVolunteer(id, name, allowance, sessions, typeService);
        //     } else {
        //         System.out.println("The type you enter is not valid. Skipping...");
        //     }
        // }
        Volunteer[] vlt = new Volunteer[5];

        vlt[0] = new CommonVolunteer("C001", "Ali", 100.0, 5, true);   // RELA
        vlt[1] = new CommonVolunteer("C002", "Bala", 90.0, 4, false);   // non-RELA
        vlt[2] = new CommonVolunteer("C003", "Cindy", 120.0, 6, true);  // RELA

        vlt[3] = new HealthVolunteer("H001", "Dina", 80.0, 3, 'A');     // Type A
        vlt[4] = new HealthVolunteer("H002", "Eric", 85.0, 2, 'B');     // Type B

        // Total net allowances
        double totalCommon = 0, totalHealth = 0;
        double highestRELANet = 0;
        Volunteer topRELA = null;

        for (Volunteer v : vlt) {
            if (v instanceof CommonVolunteer) {
                totalCommon += v.netAllowance();

                if (((CommonVolunteer) v).getIsRELA()) {
                    double net = v.netAllowance();
                    if (net > highestRELANet) {
                        highestRELANet = net;
                        topRELA = v;
                    }
                }

            } else if (v instanceof HealthVolunteer) {
                totalHealth += v.netAllowance();
            }
        }

        System.out.printf("\nTotal Net Allowance for Common Volunteers: RM %.2f\n", totalCommon);
        System.out.printf("Total Net Allowance for Health Volunteers: RM %.2f\n", totalHealth);

        if (topRELA != null) {
            System.out.println("\nVolunteer with Highest RELA Net Allowance:");
            System.out.println(topRELA.toString());
        } else {
            System.out.println("No RELA Common Volunteers found.");
        }

        sc.close();

    }
}
