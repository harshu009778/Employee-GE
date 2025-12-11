public class Employee {
    int dailyAttendance;
    static int workPerDay = 8;
    static int halfDay = 4;
    static int hourlyPay = 20;
    int dailySalary = 0;
    int monthlySalary = 0;

    static int maxHours = 100;
    static int maxDays = 20;
    int totalHours = 0;
    double totalDays = 0;


    private static int getAttendanceStatus() {
        return (int)(Math.random() * 3);   // 0, 1, 2
    }

    // --------------UC1 --------------
     public void calculateAttendance(){
         if(((Math.random()*100)%3 )==0){
             dailyAttendance = 0;
             System.out.println("Absent");
         }

         else if(((Math.random()*100)%3 )==1){
             dailyAttendance = 1;
             System.out.println("Part Time");
         }
         else{
             dailyAttendance = 2;
             System.out.println("Present");
         }
     }


     // --------------UC2 & UC3 --------------
     public void dailyWage(){
         if(dailyAttendance == 1){
             dailySalary = halfDay * hourlyPay;
             System.out.println(dailySalary);
         }
         else if(dailyAttendance == 2){
             dailySalary = workPerDay * hourlyPay;
             System.out.println(dailySalary);
         }
         else{
             System.out.println("No pay");
         }
     }

     //--------------- UC4 ---------------
     public int calAttendanceUsingSwitch(){
         int check = (int)(Math.random()*3); // 0,1,2
         dailyAttendance = check;

         switch (check){
             case 0:
                 System.out.println("Absent");
                 break;
             case 1:
                 System.out.println("Part Time");
                 break;
             case 2:
                 System.out.println("Present");
                 break;
         }
         return check;
     }

     public int dailyWageUsingSwitch(){
         switch (dailyAttendance){
             case 0:
                 dailySalary = 0;
                 System.out.println("No pay");
                 break;
             case 1:
                 dailySalary = halfDay * hourlyPay;
                 System.out.println(dailySalary);
                 break;
             case 2:
                 dailySalary = workPerDay * hourlyPay;
                 System.out.println(dailySalary);
                 break;
         }
         return dailySalary;
     }

     // -------------- UC5 :Monthly Wage --------------
    public void monthlyWage(){
        int workingDays = 20;
        monthlySalary = 0;

        for(int i=1;i<= workingDays;i++){
            System.out.println("\nDay " + i + ":");
            calAttendanceUsingSwitch();
            int wage = dailyWageUsingSwitch();
            monthlySalary += wage;
        }

        System.out.println("Total Monthly Salary = " + monthlySalary);
    }

    // -------------- UC6: Wage till 100 hours OR 20 days --------------
        public void wageUnderCondition(){
            while(totalDays <= maxDays || (totalHours <= maxHours)){
                int dailyStatus = calAttendanceUsingSwitch();
                if(dailyStatus == 0){
                    totalHours += 0;
                }
                else if(dailyStatus == 1){ // part time
                    totalHours += 4;
                }
                else if (dailyStatus == 2) { // full time
                    totalHours += 8;
                }
                totalDays++;

            }

            int wages = totalHours * hourlyPay;
            System.out.println("Wages : " + wages);
        }

    // ---------- UC7: Class Method to Compute Employee Wage ----------
    public void computeEmployeeWage(){
        while(totalDays <= maxDays || (totalHours <= maxHours)){
            int dailyStatus = getAttendanceStatus();
            if(dailyStatus == 0){
                totalHours += 0;
            }
            else if(dailyStatus == 1){ // part time
                totalHours += 4;
            }
            else if (dailyStatus == 2) { // full time
                totalHours += 8;
            }
            totalDays++;

        }

        int wages = totalHours * hourlyPay;
        System.out.println("Wages : " + wages);
    }
}
