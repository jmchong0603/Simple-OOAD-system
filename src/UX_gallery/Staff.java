/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

public class Staff extends User 
{	

    private double salary;
 
    public double getSalary()
    {
        return salary;
    }
    
    public Staff(String staff_id, String staff_password, String staff_name, String staff_contact, double staff_salary)
    {
        super(staff_id, staff_password, staff_name, staff_contact);
        salary = staff_salary;		               
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "//" + salary;
    }
	      
}
