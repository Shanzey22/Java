
    import java.util.Scanner;

public class sixth {
   public static void main(String[] args) {
    System.out.println("Taking Input from the User");
    Scanner sc=new Scanner(System.in);

   
  System.out.println("Enter subject 1 marks: ");
   int a=sc.nextInt();
   System.out.println("Enter subject 2 marks: ");
   int b=sc.nextInt();
   System.out.println("Enter subject  marks: ");
   int c=sc.nextInt();
   System.out.println("Enter subject 4 marks: ");
   int d=sc.nextInt();
   System.out.println("Enter subject 5 marks: ");
   int e=sc.nextInt();

   int percentage=(a+b+c+d+e/500)*100;
  System.out.print(percentage);
   }
}
