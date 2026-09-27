import java.util.*;
public class voter{
    public static String eligibletovote(int  a){

        if(a>=18){
            return "eligible to vote";

        }
        else{
            return " not eligible";

        }
    }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the age :");
            int a = sc.nextInt();
            String  result = eligibletovote(a);
            System.out.println("let us see:" +result);

            sc.close();
        
    }
}
