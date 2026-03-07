import java.util.Scanner;

public class Problem19Assignment1 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int empId = sc.nextInt();
        System.out.println("Enter Employee Name");
        String name = sc.next();
        System.out.println("Enter Employee Age");
        int age = sc.nextInt();
        if (age < 21) {
            System.out.println("Employee is not eligible to work. Try again later.");
            return;
        }
        System.out.println("Enter Employee Department Choices: \n1. IT \n2. HR \n3. FINANCE ");
        int deptChoice = sc.nextInt();
        System.out.println("Enter Employee Salary");
        double Salary = sc.nextDouble();
        int roleChoiceIT = 0, roleChoiceHR = 0, roleChoiceFinance = 0;
        String AccessLvl = "";

        switch (deptChoice) {
            case 1:
                System.out.println("Select Role: \n1. Developer \n2. Tester ");
                roleChoiceIT = sc.nextInt();
                break;
            case 2:
                System.out.println("Select Role: \n1. Recruiter \n2. Payroll");
                roleChoiceHR = sc.nextInt();
                break;
            case 3:
                System.out.println("Select Role: \n1. Accountant \n2. Auditor");
                roleChoiceFinance = sc.nextInt();
                break;
            default:
                System.out.println("Invalid Department Choice");
                return;
        }

        //Salary Calculation
        int allowance = 0;
        if (roleChoiceIT == 1) {
            allowance = 30;
        } else if (roleChoiceIT == 2) {
            allowance = 25;
        } else if (roleChoiceHR == 1) {
            allowance = 20;
        } else if (roleChoiceHR == 2) {
            allowance = 22;
        } else if (roleChoiceFinance == 1) {
            allowance = 28;
        } else if (roleChoiceFinance == 2) {
            allowance = 26;
        } else {
            System.out.println("Invalid Role Choice");
            return;
        }

        double FinalSalary = Salary + (Salary * allowance / 100);

        //Access Level Determination
        if (Salary >= 60000 && deptChoice == 1) {
            AccessLvl = "Admin Access";
        } else if (Salary >= 60000) {
            AccessLvl = "Manager Access";
        } else {
            AccessLvl = "Employee Access";
        }

        //Output
        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (deptChoice == 1) {
            System.out.println("Department: IT");
        } else if (deptChoice == 2) {
            System.out.println("Department: HR");
        } else if (deptChoice == 3) {
            System.out.println("Department: FINANCE");
        } else {
            System.out.println("Department: UNKNOWN");
        }

//role
        if (roleChoiceIT == 1) {
            System.out.println("Role: Developer");
        } else if (roleChoiceIT == 2) {
            System.out.println("Role: Tester");
        } else if (roleChoiceHR == 1) {
            System.out.println("Role: Recruiter");
        } else if (roleChoiceHR == 2) {
            System.out.println("Role: Payroll");
        } else if (roleChoiceFinance == 1) {
            System.out.println("Role: Accountant");
        } else if (roleChoiceFinance == 2) {
            System.out.println("Role: Auditor");
        } else {
            System.out.println("Role: UNKNOWN");
        }

        System.out.println("Base Salary: " + Salary);
        System.out.println("Final Salary: " + FinalSalary);
        System.out.println("Access Level: " + AccessLvl);
    }
}
