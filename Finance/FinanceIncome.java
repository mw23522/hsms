import java.util.Scanner;

public class FinanceIncome extends FinanceMain
{
    private String donator;
    private double amountOfDonation;
    private String duration;
    private int emplID_in_charge;
    private String description;
    
    public FinanceIncome(int emplID, String emplName, int dept, String donator_name, double amount, String duration)
    {
        super(emplID, emplName, dept);
        donator = donator_name;
        amountOfDonation = amount;
        this.duration = duration;
    }
    
    //Form for donation
    
    public void incomeMenu()
    {
        int user_input;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Homeless Shelter Management System Income Information");
        Sysmte.out.println("1. View the list");
        System.out.println("2. Create");
        System.out.println("3. Modifiy");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
    
        System.out.println();
        System.out.println();
        System.out.print("Please choose a number for an operation: ");
        user_input = scan.nextInt();
        
        switch(user_input)
            case(1):
                displayInfo();
                break;
            case(2):
                createInfo();
                break;
            case(3):
                modifyInfo();
                break;
            case(4):
                deleteInfo();
                break;
            case(5):
                
        
    }
    
    private void displayInfo()
    {
        
    }
    private void createInfo()
    {
        
    }
    private void modifyInfo()
    {
        
    }
    private void deleteInfo()
    {
        
    }
    
    
}
