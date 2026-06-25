/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

import java.io.*;
import java.util.*;

public class FileHandler {
    
    private String fileName1;
       

    ArrayList<Customer> customer1 ;
    ArrayList<Staff> staff1;
    ArrayList<Inventory> inventory1 ;
    ArrayList<Receipt> receipt1 ;
        
    File file1;

    ObjectOutputStream oosc1=null; //customer
    ObjectInputStream oisc1=null;
    ObjectOutputStream ooss1=null; //staff
    ObjectInputStream oiss1=null;
    ObjectOutputStream oosi1=null; //inventory
    ObjectInputStream oisi1=null;
    ObjectOutputStream oosr1=null; //receipt
    ObjectInputStream oisr1=null;
 
    public FileHandler(String fileName1, File file, ArrayList<Customer> customer, ArrayList<Staff> staff,
            ArrayList<Inventory> inventory ,ArrayList<Receipt> receipt) throws IOException, ClassNotFoundException 
   {
        this.fileName1 = fileName1;
        file1 = file;
        customer1 = customer;
        staff1 = staff;
        inventory1 = inventory;
        receipt1 = receipt ;

    }

    public void addToFile(String fileName,File file1,ArrayList<Customer> customer1 ,ArrayList<Staff> staff1,ArrayList<Inventory> inventory1,ArrayList<Receipt> receipt1 )throws IOException, ClassNotFoundException
    {
        
        if(fileName.compareTo("customer.txt")==0)
        {
            oosc1 = new ObjectOutputStream(new FileOutputStream(file1));
            oosc1.writeObject(customer1);
            oosc1.close(); 
        }
        else if(fileName.compareTo("staff.txt")==0)
        {
            ooss1 = new ObjectOutputStream(new FileOutputStream(file1));
            ooss1.writeObject(staff1);
            ooss1.close(); 
        }
        else if(fileName.compareTo("inventory.txt")==0)
        {
            oosi1 = new ObjectOutputStream(new FileOutputStream(file1));
            oosi1.writeObject(inventory1);
            oosi1.close();
            System.out.println("Added successfully");
        }
        else
        {
            oosr1 = new ObjectOutputStream(new FileOutputStream(file1));
            oosr1.writeObject(receipt1);
            oosr1.close(); 
        }
  }
    
    public void deleteRecordFile(String id, File file,String fileName,ArrayList<Customer> customer1 ,ArrayList<Staff> staff1 ) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        ListIterator li = null;
        boolean found = false;
        
        if(fileName.compareTo("customer.txt")==0)
        {
            li = customer1.listIterator();
            if(file1.isFile())
            {
                oisc1 = new ObjectInputStream(new FileInputStream(file1));
                customer1 = (ArrayList<Customer>)oisc1.readObject();
                oisc1.close();
            }
            li = customer1.listIterator();
            while(li.hasNext()) {

                Customer c = (Customer)li.next();
                if(id.compareTo(c.getId())==0) {
                    li.remove();
                    found = true;
                }
            }
            if(found == true) {
                oosc1 = new ObjectOutputStream(new FileOutputStream(file1));
                oosc1.writeObject(customer1);
                oosc1.close();
                System.out.println("Record Deleted Successfully...!");
            }else {
                System.out.println("Record Not Found...!");
            }  

        }
        else 
        {
            if(file1.isFile())
            {
                oiss1 = new ObjectInputStream(new FileInputStream(file1));
                staff1 = (ArrayList<Staff>)oiss1.readObject();
                oiss1.close();
            }
            li = staff1.listIterator();
            while(li.hasNext()) {

                Staff s = (Staff)li.next();
                if(id.compareTo(s.getId())==0) {
                    li.remove();
                    found = true;
                }
                
            }
            if(found == true) {
                ooss1 = new ObjectOutputStream(new FileOutputStream(file1));
                ooss1.writeObject(staff1);
                ooss1.close();
                System.out.println("Record Deleted Successfully...!");
            }else {
                System.out.println("Record Not Found...!");
            }
        }
    }  
    public void displayFile(String fileName,ArrayList<Customer> customer1 ,ArrayList<Staff> staff1,ArrayList<Inventory> inventory1,ArrayList<Receipt> receipt1, String validate) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        Boolean slist = false;
        if(fileName.compareTo("customer.txt")==0)
        {
            for(int i = 0; i < customer1.size(); i++)
            {
                Customer c = customer1.get(i);
                System.out.println(i + 1 + "//" + c.toString());
                slist = true;
                
            }       
            
            if(slist == false)
            {
                System.out.print("No record found!!");
            }
        }
        else if(fileName.compareTo("staff.txt")==0)
        {
            if(file1.isFile())
            {
                oiss1 = new ObjectInputStream(new FileInputStream(file1));
                staff1 = (ArrayList<Staff>)oiss1.readObject();
                oiss1.close();
            }
            
            for(int i = 0; i < staff1.size(); i++)
            {
                Staff s = staff1.get(i);
                System.out.println(i + 1 + "//" + s.toString());
                slist = true;
                
            }    
            
            if(slist == false)
            {
                System.out.print("No record found!!");
            }
        }
        else if(fileName.compareTo("inventory.txt")==0)
        {
            if("staff".equals(validate))
            {
                for(int i = 0; i < inventory1.size(); i++)
                {
                    Inventory inv = inventory1.get(i);
                    int no = i + 1;
                    System.out.println(no + "//" + inv.toStringForStaff());
                    slist = true;
                    
                }   
                
                if(slist == false)
                {
                    System.out.print("No record found!!");
                }
            }
            else
            {
                for(int i = 0; i < inventory1.size(); i++)
                {
                    Inventory inv = inventory1.get(i);
                    System.out.println(i + 1 + ")\n" + inv.toStringForCustomer());
                    slist = true;
                    
                }        
                
                if(slist == false)
                {
                    System.out.print("No record found!!");
                }
                
            }
                
        }
        else
        {
            if("staff".equals(validate))
            {
                for(int i = 0; i < receipt1.size(); i++)
                {
                    Receipt r = receipt1.get(i);                  
                    System.out.println(i + 1 + "//" + r.toStringForStaff());
                    slist = true;
                }                         
                if(slist == false)
                {
                    System.out.print("No record found!!");
                }
            }
            else
            {
                for(int i = 0; i < receipt1.size(); i++)
                {
                    Receipt r = receipt1.get(i);
                    System.out.println(i + 1 + ")\n" + r.toStringForCustomer());
                    slist = true;
                }
            }           
            if(slist == false)
            {
                System.out.print("No record found!!");
            }          
        }
    }  
 
    public void updateFile(String id, String fileName,ArrayList<Customer> customer1 ,ArrayList<Staff> staff1,ArrayList<Inventory> inventory1) throws FileNotFoundException, IOException{
        
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        
        if(fileName.compareTo("customer.txt")==0 || fileName.compareTo("staff.txt")==0)
        {
            
            System.out.print("Please Enter New Name : ");
            String name = sc.nextLine();
            name = name.toUpperCase();

            System.out.print("Please Enter New Contact Number : ");
            String contact = sc.nextLine();

            System.out.print("Please Enter New Password : ");
            String password = sc.nextLine();
            
            if(fileName.compareTo("customer.txt")==0 )
            {
                ListIterator<Customer> li = customer1.listIterator();
                while(li.hasNext())
                {
                    Customer c = (Customer)li.next();
                    
                    if(id.equals(c.getId()))
                    {
                        li.set(new Customer(c.getId(),password, name, contact));
                        oosc1 = new ObjectOutputStream(new FileOutputStream(file1));
                        oosc1.writeObject(customer1);
                        oosc1.close();
                        found = true;
                        break;
                        
                    }  
                }
                if(found) 
                {
                    
                    System.out.println("Record Updated Successfully...!");

                }
                else
                {
                    System.out.println("Record Not Found...!");
                }
            }
            else //staff.txt
            {
                ListIterator<Staff> li = staff1.listIterator();
                while(li.hasNext())
                {
                    Staff s = (Staff)li.next();
                    
                    if(id.equals(s.getId()))
                    {                       
                            li.set(new Staff(s.getId(),password, name, contact, s.getSalary()));
                            found = true; 
                            break;
                    }                                      
                }
                if(found) 
                {            
                    ooss1 = new ObjectOutputStream(new FileOutputStream(file1));
                    ooss1.writeObject(staff1);
                    ooss1.close();

                    System.out.println("Record Updated Successfully...!");

                }
                else
                {
                    System.out.println("Record Not Found...!");
                }
            }      
        }
        else //inventory.txt
        {         
            int stock = 0;
            while (true) 
            {
                try 
                {
                    System.out.print("Please Enter Number of Stock to add : ");
                    stock = Integer.parseInt(sc.nextLine());
                    break;
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Please enter an integer.");
                }
            }
            ListIterator<Inventory> li = inventory1.listIterator();
            while(li.hasNext())
            {
                
                Inventory inv = (Inventory)li.next();
                if(id.equals(inv.getInventoryId()))
                {
                    li.set(new Inventory(inv.getInventoryId(),inv.getArtist(),inv.getTitle(), inv.getDescription(),
                    inv.getPurchasePrice(),inv.getSellingPrice(),inv.getStock() + stock));
                    found = true;

                    break;
                }                            
            }
            if(found) 
            {               
                oosi1 = new ObjectOutputStream(new FileOutputStream(file1));
                oosi1.writeObject(inventory1);
                oosi1.close();

                System.out.println("Record Updated Successfully...!");
            }
            else 
            {
                System.out.println("Record Not Found...!");
            }
        }
    }
    public void autoUpdateFile(String art_id,ArrayList<Inventory> inventory1) throws FileNotFoundException, IOException
    {
        boolean found = false;
        ListIterator<Inventory> li = inventory1.listIterator();
        
        while(li.hasNext())
        {
                
            Inventory inv = (Inventory)li.next();
                    
            if(art_id.equals(inv.getInventoryId()))
            {
                li.set(new Inventory(inv.getInventoryId(), inv.getArtist(),inv.getTitle(), inv.getDescription(),
                inv.getPurchasePrice(),inv.getSellingPrice(),inv.getStock()-1));
                found = true;
                break;
                
            }           
        }
        if(found) 
        {
            oosi1 = new ObjectOutputStream(new FileOutputStream(file1));
            oosi1.writeObject(inventory1);
            oosi1.close();
        }


    }
    public void searchFile(String fileName,ArrayList<Customer> customer1 ,ArrayList<Staff> staff1,ArrayList<Inventory> inventory1,ArrayList<Receipt> receipt1,String name, String id, String validate) throws FileNotFoundException, IOException, ClassNotFoundException{

        boolean found = false;
        if(fileName.compareTo("customer.txt")==0)
        {  
            ListIterator li = customer1.listIterator();
            int integer = 0;
            while(li.hasNext()) 
            {
                
                Customer c = (Customer)li.next();
                if(name != null)
                {
                    if(name.compareTo(c.getName())==0) 
                    { 
                        integer ++;
                        System.out.println(integer + "//" +c.toString());
                        found = true;                            
                
                    }                       
                }
                else
                {
                    if(id.compareTo(c.getId())==0)
                    { 
                        System.out.println(c.toString());
                        found = true;
                    }                       
                }            
            }               
                 
            if(found == false) 
            {
                System.out.println("Record Not Found...!");   
            }
                      
        }
        else if(fileName.compareTo("staff.txt")==0)
        {          
            ListIterator li = staff1.listIterator();
            int integer = 0;
            while(li.hasNext()) 
            {
                Staff s = (Staff)li.next();
                if(name != null)
                {
                    if(name.compareTo(s.getName())==0) 
                    {   
                        integer ++;
                        System.out.println(integer + "//" +s.toString());
                        found = true;                                                         
                    }                       
                }
                else
                {
                    if(id.compareTo(s.getId())==0)
                    {                       
                        System.out.println(s.toString());
                        found = true;
                    }                       
                }            
            }               
                 
            if(found == false) 
            {
                System.out.println("Record Not Found...!");   
            }
        }
        else if(fileName.compareTo("inventory.txt")==0)
        {
            ListIterator li = inventory1.listIterator();
            int integer = 0;
            while(li.hasNext())
            {
                Inventory i = (Inventory)li.next();
                if("staff".equals(validate))
                {                   
                    if(id.compareTo(i.getInventoryId())==0) 
                    {                  
                        System.out.println(i.toStringForStaff());
                        found = true;                                            
                    }   
                }
                else
                {              
                    if(name.compareTo(i.getArtist().toUpperCase())==0) 
                    {              
                        integer++;
                        System.out.println(integer + ")\n" + i.toStringForCustomer());
                        found = true;
                    }                                   
                }               
            }  
            
            if(found == false) 
            {
                System.out.println("Record Not Found...!");   
            }
        }
        else
        {
           ListIterator li = receipt1.listIterator();
           int integer = 0;
            while(li.hasNext())
            {
                Receipt r = (Receipt)li.next();
                if("staff".equals(validate))
                {                   
                    if(id.compareTo(r.getReceiptId())==0) 
                    {                  
                        System.out.println(r.toStringForStaff());
                        found = true;                                            
                    }   
                }
                else
                {              
                    if(id.compareTo(r.getCustomerId())==0) 
                    {   
                        integer++;
                        System.out.println(integer + ")\n" + r.toStringForCustomer());
                        found = true;
                    }
                    else
                    {
                        if(id.compareTo(r.getReceiptId())==0) 
                        {
                            System.out.println("\n" + r.toStringForCustomer() );
                            found = true;
                        }
                        
                    }
                }               
            }  
            
            if(found == false) 
            {
                System.out.println("Record Not Found...!");   
                
            }
            
        }
        
    }
}

