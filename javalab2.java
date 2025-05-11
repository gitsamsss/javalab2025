import java.util.Scanner;
public class javalab2 {
public static void main(String[] args)

{
  Scanner scanner= new Scanner(System.in);
  System.out.println("enter your name:");
  String name = scanner.nextLine();
  System.out.println("enter your roll_no:");
  int roll_no = scanner.nextInt(); 

  scanner.nextLine();
  System.out.println("enter your marks(0-100):");
  int marks = scanner.nextInt();
  String grade;
  if (marks>90) 
  {
    grade= "A+";
  }
  else if (marks>=80) 
  {
    grade= "A";  
  }
  else if (marks>=70) 
  {
    grade= "B+";
  }
  else if (marks>=60) 
  {
    grade= "B";
  }
  else if (marks>=50) 
  {
    grade= "C";
  }
  else if (marks>=40) 
  {
    grade= "D";
  }
  else {
    grade= "NG";

  }
  System.out.println("Name is"+name);
  System.out.println("Roll No is"+roll_no);
  System.out.println("Marks is"+marks);
  System.out.println("Grade is"+grade);
  scanner.close();
}
  
}
