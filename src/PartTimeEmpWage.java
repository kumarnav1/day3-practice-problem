public class PartTimeEmpWage {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empWagePerHr = 20;
        int empHrs = 0;
        int wage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FULL_TIME) {
            empHrs = 10;
            wage = empHrs * empWagePerHr;
            System.out.println("Employee working full time and wage is = " + wage);
        } else if (empCheck == IS_PART_TIME) {
            empHrs = 8;
            wage = empHrs * empWagePerHr;
            System.out.println("Employee is working part time and wage is = " + wage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
