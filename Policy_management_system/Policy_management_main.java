package Policy_management_system;
import java.util.*;

public class Policy_management_main {
    public static void main(String[] args) {
        Policy_manager manager=new Policy_manager();
        System.out.println("Welcome to Policy management system");
        do{
            System.out.println("1. Add policy\n2. Get all unique policies \n3. Get policies expiring soon\n4. Get policies by coverage \n5. Find duplicate policies\n6. Compare performance\n7. Exit  ");
            System.out.println("Enter your option:");
            Scanner s=new Scanner(System.in);
            switch(s.nextInt()){
                case 1:
                    System.out.println("Enter policy number:");
                    int policy_no = s.nextInt();
                    s.nextLine(); // consume newline
                    System.out.println("Enter policy holder name:");
                    String policy_holder = s.nextLine();
                    System.out.println("Enter expiry date (yyyy-mm-dd):");
                    String dateStr = s.nextLine();
                    Date expiry_date = java.sql.Date.valueOf(dateStr);
                    System.out.println("Enter coverage type:");
                    String coverage = s.nextLine();
                    System.out.println("Enter amount:");
                    long amount = s.nextLong();
                    Policy policy = new Policy(policy_no, policy_holder, expiry_date, coverage, amount);
                    manager.addPolicy(policy);
                    System.out.println("Added Successfully!");
                    break;
                case 2:
                    System.out.println("All unique policies:");
                    for (Policy p : manager.getAllUniquePolicies()) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Policies expiring soon:");
                    for (Policy p : manager.getPoliciesExpiringSoon()) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.println("Enter coverage type:");
                    s.nextLine(); // consume newline
                    String cov = s.nextLine();
                    System.out.println("Policies with coverage type " + cov + ":");
                    for (Policy p : manager.getPoliciesByCoverage(cov)) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Duplicate policies:");
                    for (Policy p : manager.findDuplicatePolicies()) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    break;

                case 7:
                    return;
                default:
                    System.out.println("Invalid!");
                    break;
            }

        }while(true);
    }
}
