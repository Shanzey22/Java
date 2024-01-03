public class twentythree {
    public  static void  main(String[]args){
       /*  You have 2 options
        1.Create 588 variables
        2.Use Arrays(recommended)*/
        //There are three main ways to create an array in Java
        //1.Declaration and memory allocation
        //int[marks=new int [5];

        //2.declaration and then memory allocation
   /*     int[]marks=new int[5];
        marks[0]=100;
        marks[2]=60;
        marks[3]=90;
        marks[4]=86;*/

        //3.Declaration ,memory allocation and initalization together
        int []marks={98,45,79,99,88};
       //  marks[5]=96; - throws an error
       
        System.out.println(marks[4]);
    }
}
