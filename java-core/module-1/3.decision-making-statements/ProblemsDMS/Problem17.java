
import java.util.Scanner;

public class Problem17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select The Deapartment(1,2,3,4): \n1-IT \n 2-HR \n 3-FINANCE \n 4-OPERATIONS");
        String Dept = sc.next();
        switch (Dept) {
            case "IT":
                System.out.println("Please Choose Your desired Role :\n1. Developer \n2. Tester \n3. DevOpsEngineer");
                String n1 = sc.next();
                switch (n1) {
                    case "Developer":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n1);
                        break;
                    case "Tester":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n1);
                        break;
                    case "DevOpsEngineer":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n1);
                        break;
                }
                break;
            case "HR":
                System.out.println("Please Choose Your desired Role :\n1. Recruiter \n2. HRManager \n3. PayrollSpecialist");
                String n2 = sc.next();
                switch (n2) {
                    case "Recruiter":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n2);
                        break;
                    case "HRManager":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n2);
                        break;
                    case "PayrollSpecialist":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n2);
                        break;
                }
                break;
            case "Finance":
                System.out.println("Please Choose Your desired Role :\n1. Accountant \n2. FinancialAnalyst \n3. Auditor");
                String n3 = sc.next();
                switch (n3) {
                    case "Accountant":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n3);
                        break;
                    case "FinancialAnalyst":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n3);
                        break;
                    case "Auditor":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n3);
                        break;
                }
                break;
            case "Operations":
                System.out.println("Please Choose Your desired Role :\n1. OperationsManager \n2. TeamLead \n3. Coordinator");
                String n4 = sc.next();
                switch (n4) {
                    case "OperationsManager":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n4);
                        break;
                    case "TeamLead":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n4);
                        break;
                    case "Coordinator":
                        System.out.println("Your Selected Department and role is: " + Dept + " AND " + n4);
                        break;
                }
                break;
        }

    }
}
