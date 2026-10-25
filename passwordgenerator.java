// Online Java Compiler
// Use this editor to write, compile and run your Java code onlin
import java.util.Random;
public class passwordgenerator{
     public static void main(String[] args){
         String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
         Random random= new Random();
         
         int length=12;
         StringBuilder password= new StringBuilder();
         for(int i=0;i<length;i++){
              int index=random.nextInt(s.length());
              char ch=s.charAt(index);
              password.append(ch);
         }
         System.out.println(password);
         
         // u will get the password in the console when u run the program

     }
}
