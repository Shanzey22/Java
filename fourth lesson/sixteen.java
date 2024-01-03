import java.util.Scanner;

public class sixteen {
    
    
    public static void main(String[] args){
        int age;
        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch(age){
        case 18:
        System.out.println("You are going to became an adult");
        break;
        case 23:
        System.out.println("You are going to join a Job");
        break;
        case 68:
        System.out.println("You are going to get retired  a Job!");
        break;
        default:
        System.out.println("Enjoy you life");
        break;
       }
     
        System.out.println("Thanks for using my Java Code!");
     

         /* 
        if(age>56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi-experienced");
        }
         else if (age>36){
            System.out.println("You are semi semi-experienced");
        }
         else{
            System.out.println("You are not experienced");
        }
        if(age>2){
             System.out.println("You are not a baby");
        }
        */
}
}

