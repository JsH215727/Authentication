package javamethoddemo;

import java.util.Scanner;

public class UserAuthentication {
   private static String correctUsername = "ProfessorJas";
   private static String correctPassword = "940527";
   private static String username;
   private static String password;

   public static void main(String[] args) {
	   Scanner kbd = new Scanner(System.in);
	   System.out.println("Enter the username: ");
	   username = kbd.next();
           System.out.println("Enter the password: ");
           password = kbd.next();
	   
	   if(authenciation(username, password))
		   System.out.println("Welcome " + username);
	   else
		   System.out.println("Wrong Username Or Password");
}

   
   public static boolean authenciation(String username, String password){
       //authentication
       boolean status;
       if (username.equalsIgnoreCase(correctUsername)){
           if (password.equals(correctPassword)){
               System.out.println("Welcome " + correctUsername + "!");
               status = true;
           }else{
               status = false;
               System.out.println("Wrong password, GGWP!");
           }return status;
       }else{
           status = false;
           System.out.println("Wrong username, GGWP!");
       }
       return false;
   }
}