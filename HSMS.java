import java.util.Scanner;

public class HSMS
{
    private long employee_ID;
    private String employee_name;
    private int dept_num; // department is indecated as an interger. For example, 1: HR, 2:Technical, 3: Coordinating/Event, 4:Finance, 5:Legal
    
    public HSMS(long emplID, String employeeName, int deptNum)
    {
        employee_ID = emplID;
        employee_name = employeeName;
        dept_num = deptNum;
    }
    
    //set - id, name and dept num -> modify the information
    public void reset(long emplID, String employeeName, int deptNum)
    {
        employee_ID = emplID;
        employee_name = employeeName;
        dept_num = deptNum;
    }
    
    public void setEmplId(long new_id)
    {
        employee_ID = new_id;
    }
    public void setEmplName(String new_name)
    {
        employee_name = new_name;
    }
    public void setDeptNum(int new_dept_num)
    {
        dpet_num = new_dept_num;
    }
    
    //Get - id, name and department number
    
    public long getEmplID()
    {
        return employee_ID;
    }
    public String getEmplName()
    {
        return employee_name;
    }
    public int getDeptNum()
    {
        return dept_num;
    }
    
}