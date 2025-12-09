public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int halfDay = 4;
    int hourlyPay = 20;
    int dailySalary = 0;
    int monthlySalary = 0;

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
         int check = (int)(Math.random()*3);
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

}
