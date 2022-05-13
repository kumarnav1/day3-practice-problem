public class EmpWageUC2 {
    public static void main(String[] args) {

        int IS_PRESENT = 1;
        int empWagePerHr = 20;
        int empHrs = 8;
        int wage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            wage = empWagePerHr * empHrs;
        } else
            System.out.println("Employee wage = " + wage);
    }
}
