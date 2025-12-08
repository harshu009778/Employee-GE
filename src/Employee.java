public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int halfDay = 4;
    int hourlyPay = 20;
    int dailySalary = 0;

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


}
