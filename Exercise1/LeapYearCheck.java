/* Write a Java program to find the number of days in a month for a given year. Check Leap year also. */



import java .util.Scanner ;

class LeapYearCheck{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int year,Month;
        String month,leapyear; 
        
        System.out.println("Enter month :");
	Month=in.nextInt(); 
        
        System.out.println("Enter year  :");
        year=in.nextInt();
        if((year%4 == 0) || ((year%100 == 0) &&(year%400 == 0))) {
              leapyear = " Is leap year";  
        }
        else{
              leapyear = " Is not a leap year";
              }
        

        switch(Month){

	   case 1:month="january";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

	   case 2:month="february";
		  if(leapyear==" Is leap year"){
                  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 29 days");
                  }
                  else{
                  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 28 days");
                  }
                  break;
		
	   case 3:month="march";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

	   case 4:month="april";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 30 days");
                  break;

	   case 5:month="may";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;
	
	   case 6:month="june";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 30 days");
                  break;

	   case 7:month="july";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

	   case 8:month="augest";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

	   case 9:month="september";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 30 days");
                  break;

	   case 10:month="october";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

	   case 11:month="november";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 30 days");
                  break;
	   case 12:month="december";
		  System.out.println(year+""+leapyear);
                  System.out.println(month + " " + " has 31 days");
                  break;

         }
    }
}   
         



/*

OUTPUT:


Enter month :4
Enter year  :2020
2020 Is leap year
april  has 30 days

_____________________

Enter month :5
Enter year  :1998
1998 Is not a leap year
may  has 31 days


*/