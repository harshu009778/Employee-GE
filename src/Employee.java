public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int halfDay = 4;
    int hourlyPay = 20;
    int dailySalary = 0;

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
     public void calAttendanceUsingSwitch(){
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
     }

     public void dailyWageUsingSwitch(){
         switch (dailyAttendance){
             case 0:
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
     }

}
