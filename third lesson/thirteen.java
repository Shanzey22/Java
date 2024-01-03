//import java.util.Scanner;
public class thirteen {
    public static void main(String[] args){
        String name="Harry";
       // System.out.println("The name is: ");
      //  System.out.println(name);
      int value=name.length();
      System.out.println(value);

      String lstring=name.toLowerCase();
      System.out.println(lstring);

      String ustring=name.toUpperCase();
      System.out.println(ustring);

      String nonTrimmedString="Harry";
      System.out.println(nonTrimmedString);

      String trimmedString=nonTrimmedString.trim();
      System.out.println(trimmedString);
    }}