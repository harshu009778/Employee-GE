public class Main {


    public static void main(String[] args) {
        Employee e1 = new Employee();

        // ------- UC1 ---------
        //e1.calculateAttendance();;

        // ------ UC2 & UC3 ------------
        //e1.dailyWage();

        //--------- UC4 ----------
        e1.calAttendanceUsingSwitch();
        e1.dailyWageUsingSwitch();

        //--------- UC5 -----------
        e1.monthlyWage();

        // -------------- UC6: Wage till 100 hours OR 20 days --------------
        e1.wageUnderCondition();

        // -------------- UC7: Using Class Method & Class Variables -------------
        e1.computeEmployeeWage();

        // ---------- UC8: Compute Employee Wage for multiple companies ----------
        e1.computeEmployeeWage("GE Vernova" , 25, 30 , 120);


    }
}
