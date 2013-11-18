/* HMSM - Homless Shleter Management System
 * Modified Date: 12/11/2013
 * Author: Julie Yu
 * Wrapper for finance class
 */

public class FinanceMain
{
	private int empleID;
	private String emplName;
	private int dept; //department should be a number for a clarification

	public FinanceMain(int emplID, String emplName, int dept)
	{
		this.empleID = emplID;
		this.emplName = emplName;
		this.dept = dept;
	}
	
	public void checkValidity()
	{
		//check with database if the person is in finance deptment
	}
	

}
