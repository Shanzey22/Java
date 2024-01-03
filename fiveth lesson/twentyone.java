public class twentyone {
    public static void main(String[] args) {
        //Break and continue using loops
     /*  for (int i=1;i<=10;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
             System.out.println(i);
            System.out.println("Java is great");
           } */
            int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(i);
                System.out.println("Java is great");
          
           }while(i<5);
             System.out.println("Loop ends here");
        }
}
