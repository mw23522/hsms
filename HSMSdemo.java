import java.util.Scanner

public class HSMSdemo
{
    public static void main(String[] args)
    {
        int user_input_menu;
        long empl_id;
        String empl_name;
        int empl_dept_num;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Homless Shelter Mangaement System");
        System.out.println("Welcome to HSMS program.");
        System.out.println("To proceed, please type 1) Employee ID, 2)Name, 3)Department ID number");
        System.out.println();
        System.out.print("Employee ID >>  ");
        empl_id = scan.nextLong();
        System.out.println();
        System.out.print("Employee Name >>  ");
        empl_name = scan.next();
        System.out.println();
        System.out.print("Department ID number >>  ");
        empl_dept_num = scan.nextInt();
        
        //Use static method to check if the id and name are in the database;
        
        //Once the validity is confirmed,
        
        System.out.println("---------------------------------");
        System.out.println("----------Menu-------------------");
        System.out.println("1. Employee Directory DB");
        System.out.println("2. Finance Information DB");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("Please select a number >>  ");
        user_input = scan.nextInt();
        
        switch (user_input):
            case (1):
                //initiate employee directory
                           
            case (2):
                finance();
                break;
        
    }
}