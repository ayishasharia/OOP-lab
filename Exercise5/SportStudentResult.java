interface Student{
   int score=10; 
   void displayScore();
}
interface Sports {
   int score=25;
   void displaySportScore();
}
class Result implements Student,Sports {
    public void displayScore() {
      System.out.println("Academic score is :"+Student.score);
    }
   public void displaySportScore(){
      System.out.println("Sports score is :"+Sports.score);
    }
}
public class SportStudentResult{
  public static void main(String[] args){
   Result r=new Result( );
   r.displayScore( );
   r.displaySportScore( );
}
}

/* OUTPUT
----------

C:\Users\IN\Desktop>javac SportStudentResult.java

C:\Users\IN\Desktop>java SportStudentResult
Academic score is :10
Sports score is :25

*/