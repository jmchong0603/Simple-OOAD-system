/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, Exception 
    {
        
        Scanner sc = new Scanner(System.in);
      
        File sfile = new File("staff.txt");
        File cfile = new File("customer.txt");
        File ifile = new File("inventory.txt");
        File rfile = new File("receipt");

        ArrayList<Customer> customer = new ArrayList<Customer>();
        ArrayList<Staff> staff = new ArrayList<Staff>();
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        ArrayList<Receipt> receipt = new ArrayList<Receipt>();
       
        FileHandler fhc = new FileHandler( "customer.txt" ,cfile,customer,null,null,null);
        FileHandler fhs = new FileHandler( "staff.txt" ,sfile, null,staff,null,null);
        FileHandler fhi = new FileHandler( "inventory.txt" ,ifile,null,null,inventory,null);
        FileHandler fhr = new FileHandler( "receipt.txt" ,rfile,null,null,null,receipt);
        
        if(cfile.isFile())
        {
            fhc.oisc1 = new ObjectInputStream(new FileInputStream(cfile));
            customer = (ArrayList<Customer>)fhc.oisc1.readObject();
            fhc.oisc1.close();
        }
        else
        {
            //default customer  (String id, String password, String name, String contact)
            customer.add(new Customer("C1","R3dApple$","NURUL HUDA","0173845678"));
            customer.add(new Customer("C2","Gr33nTurtl3","MEI LING","01129874532"));
            customer.add(new Customer("C3","7Blu3Birds","SHARMA","0147642190"));
            customer.add(new Customer("C4","Purpl3Panda5","JOHN SMITH","0195423416"));
            customer.add(new Customer("C5","Y3llowSunshin3","KIRONOHINGAN","0189166453"));
            customer.add(new Customer("C6","1Orang3Rose","ELIZABETH MARTINEZ","0137623901"));
            customer.add(new Customer("C7","Gr33nEy3s9","JAMNES WILSON","0128765432"));
            customer.add(new Customer("C8","F1shingL0v3","JENNIFER GARCIA","0163289087"));
            customer.add(new Customer("C9","4HappyDogs","RAVI","0156872345"));
            customer.add(new Customer("C10","T3nnisChamp1","WILLIAM LEE","01126754890"));
            fhc.addToFile( "customer.txt", cfile, customer,null,null,null);
        }
       
        
        
        if(sfile.isFile())
        {
            fhs.oiss1 = new ObjectInputStream(new FileInputStream(sfile));
            staff = (ArrayList<Staff>)fhs.oiss1.readObject();
            fhs.oiss1.close();
        }
        else
        {
            //default staff  (String staff_id, String staff_password, String staff_name, String staff_contact, double staff_salary)
            staff.add(new Staff("S1","Kim123","RACHEL KIM","0195432190",5600));
            staff.add(new Staff("S2","Brian456","BEIAN RODRIGUEZ","0189025678",3400));
            staff.add(new Staff("S3","Wong789","STEPHANIE WONG","0136549087",4200));
            staff.add(new Staff("S4","147Alex","ALEX PATEL","01276542345",5100));
            staff.add(new Staff("S5","852Garcia","MARIA GARCIA","0162894532",4200));
            staff.add(new Staff("S6","963Daniel","DANIEL NGUYEN","01132456789",3900));
            staff.add(new Staff("S7","JC000","JENNIFER CHEN","01478901234",8200));
            staff.add(new Staff("S8","leeeee","KEVIN LEE","01567458901",4500));
            staff.add(new Staff("S9","Davis123","SARAH DAVIS","01789012345",4800));
            staff.add(new Staff("S10","Anthony666","ANTHONY HERNANDEZ","01954321098",6100));
            fhs.addToFile( "staff.txt", sfile, null,staff,null,null);
            
        }
        
        if(ifile.isFile())
        {
            fhi.oisi1 = new ObjectInputStream(new FileInputStream(ifile));
            inventory = (ArrayList<Inventory>)fhi.oisi1.readObject();
            fhi.oisi1.close();
        }
        else
        {
            
            //default artwork  (String artist, String title, String description, double purchasePrice, double sellingPrice, int stock)
            inventory.add(new Inventory("I1","Vincent van Gogh", "The Stary Night", "A vivid depiction of the night sky over a village, with swirling clouds and stars painted in a bold, expressionisyic style.", 100.00, 250.00, 10));
            inventory.add(new Inventory("I2","Piet Mondrian", "Composition II Red Blue and Yellow", "A painting that epitomizes the De Stijl movement, with bold blocks of primary colors and black grid lines.", 200.00, 500.00, 5));
            inventory.add(new Inventory("I3","Pablo Picasso", "Guernics", "A monumental painting that depicts the horrors of war, particularly the bombing of the Spanish town of Guernica during the Spanish Civil War.", 150.00, 400.00, 0));
            inventory.add(new Inventory("I4","Claude Monet", "Water Lilies", "A series of impressionist paintings of Monet's flower garden at Giverny, featuring the iconic water lilies and reflection of the sky.", 175.00, 300.00, 4));
            inventory.add(new Inventory("I5","Vincent van Gogh", "Sunflowers", "A series of still-life paintings depicting sunflowers in a vase, created by Van Gogh in Arles, France in 1888.", 235.00, 475.00, 6));
            inventory.add(new Inventory("I6","Salvador Dali", "The Persistence of Memory", " A surreal landscape with melting clocks, representing the fluidity of time and memory.", 130.00, 290.00, 3));
            inventory.add(new Inventory("I7","Pablo Picasso", "The Old Guitarist", "A painting from Picasso's Blue Period, depicting a gaunt, blind musician hunched over his instrument in a pose of despair.", 300.00, 550.00, 0));
            inventory.add(new Inventory("I8","Piet Mondrian", "Composition No. 10", "A painting with a grid of black lines and colored rectangles that are seemingly in motion, expressing a sense of harmony and equilibrium.", 250.00, 300.00, 3));
            inventory.add(new Inventory("I9", "Edvard Munch", "The Scream", "A haunting depiction of a figure with a twisted and anguished face, set against a blood-red sky.", 190.00, 450.00, 1));
            inventory.add(new Inventory("I10", "Leonardo da Vinci", "Mona Lisa", "A portrait of a woman with a mysterious smile, considered one of the most famous paintings in the world.", 500.00, 750.00, 2));
            fhi.addToFile( "inventory.txt", ifile, null,null,inventory,null);
            
        }
    
        if(rfile.isFile())
        {
            fhr.oisr1 = new ObjectInputStream(new FileInputStream(rfile));
            receipt = (ArrayList<Receipt>)fhr.oisr1.readObject();
            fhr.oisr1.close();
        }           
      
        //User interface
	boolean loop = true;
        while(loop == true)
        {
           int choice = 0;
                
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("+        WELCOME TO UX GALLERY       +");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("+  1. Login                          +");
            System.out.println("+  2. Signup a customer account      +");
            System.out.println("+  3. Exit                           +");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            
            while (true) 
            {
                try 
                {
                    System.out.print("Enter Your Choice : ");
                    choice = Integer.parseInt(sc.nextLine());
                    break; // Exit the loop if parsing is successful
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Please enter an integer.");
                }
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("\n\n");

            
            
            switch(choice){
                
                case 1: login(sfile,cfile,ifile,rfile,customer,staff,inventory,receipt,fhc,fhs,fhi,fhr);break;

                case 2: signup(fhc,cfile,customer);break;
                        
                case 3: exit(loop); loop = false; break;
                
                    
            }
        }                 
    }
    
    //login function
    public static void login(File sfile,File cfile,File ifile,File rfile,ArrayList<Customer> customer,ArrayList<Staff> staff,ArrayList<Inventory> inventory,ArrayList<Receipt> receipt,
            FileHandler fhs, FileHandler fhc, FileHandler fhi, FileHandler fhr )throws Exception
    {
        System.out.println("--------------------------------------");
        System.out.println("|              LOGIN                 |");
        System.out.println("--------------------------------------");
        //get input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("User ID : ");
        String id = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
           
        boolean loginSuccessful = false;
        
        //verify id and password
        if(id.charAt(0)== 'A')
        {
            //ADMIN id and password
            if(id.compareTo("A123")==0 && password.compareTo("12345")==0)
            {
                loginSuccessful = true;
            }    
   
        }
        else if(id.charAt(0)== 'C')
        {
            for(int i=0; i < customer.size(); i++)
            {
                Customer c =customer.get(i);

                if(id.compareTo(c.getId())==0 && password.compareTo(c.getPassword())==0)
                {
                    loginSuccessful = true;
                }  
            } 

        }
        else if(id.charAt(0)== 'S')
        {
            for(int i=0; i < staff.size(); i++)
            {
                Staff s = staff.get(i);

                if(id.compareTo(s.getId())==0 && password.compareTo(s.getPassword())==0)
                {
                    loginSuccessful = true;
                }  
            } 
        }
        else
        {              
        }
        
        if (loginSuccessful) 
        {
            System.out.println("Login successful");            
            userMain(id,sfile,cfile,ifile,rfile,customer,staff,inventory,receipt,fhc,fhs,fhi,fhr);
        } 
        else 
        {
            System.out.println("Login failed");
        }
       
        System.out.println("\n\n");
             
    }
    public static void signup(FileHandler fhc ,File cfile, ArrayList<Customer> customer)throws Exception
    {
        //get input from user
        Scanner sc =new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("|              SIGNUP                |");
        System.out.println("--------------------------------------");
	System.out.print("Please Enter Your Name : ");
	String name = sc.nextLine();
        name = name.toUpperCase();
	System.out.print("Please Enter Your Contact Number : ");
	String contact = sc.nextLine();
        System.out.print("Please Enter Your Password : ");
	String password = sc.nextLine();
        
        //generate random id for customer
        System.out.println("Hello " + name + ". Nice to meet you!");
        Random random = new Random();
        String id = "C" + random.nextInt();
        Boolean checkId = true;
        while(checkId)
        {
            id = "C" + random.nextInt();
            checkId = false;
        
            for(int i = 0; i < customer.size(); i++)
            {
                Customer c = customer.get(i);           
                
                if(id.compareTo(c.getId()) == 0)
                {
                    checkId = true;
                }                
            }
        }		
	System.out.println("Your ID is " + id);
	Customer u = new Customer(id, password, name, contact);
        
        //add new customer to customer.txt
        customer.add(u);
        fhc.addToFile( "customer.txt", cfile, customer,null,null,null);
        System.out.println("\n\n");
                    
    }
    public static void exit(boolean loop)
    {
        System.out.println("--------------------------------------");
        System.out.println("|             THANK YOU              |");
        System.out.println("--------------------------------------\n\n");
        
    }
    public static void userMain(String id,File sfile, File cfile,File ifile,File rfile,ArrayList<Customer> customer,ArrayList<Staff> staff,ArrayList<Inventory> inventory,ArrayList<Receipt> receipt,
            FileHandler fhs, FileHandler fhc, FileHandler fhi, FileHandler fhr)throws Exception
    {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        
        //determine type of account(Admin/Staff/Customer)
        if(id.charAt(0)== 'A')
        {
                      
            System.out.println("\n\n======================================");
            System.out.println("|     This is an ADMIN account.      |");
            System.out.println("======================================");
            
            while(check == true)
            {
                //Admin main interface
                //Admin no need to add customer
                System.out.println("--------------------------------------");
                System.out.println("|  1) Add Staff                      |");
                System.out.println("|  2) Delete Staff                   |");
                System.out.println("|  3) Delete Customer                |");
                System.out.println("|  4) Display Staff                  |"); 
                System.out.println("|  5) Display Customer               |");
                System.out.println("|  6) Search Customer-name           |"); 
                System.out.println("|  7) Search Customer-id             |"); 
                System.out.println("|  8) Search Staff-name              |");
                System.out.println("|  9) Search Staff-id                |");
                System.out.println("|  0) Exit                           |");
                System.out.println("--------------------------------------");
                
                int choice = 0;
                while (true) 
                {
                    try 
                    {
                        System.out.print("Enter Your Choice : ");
                        choice = Integer.parseInt(sc.nextLine());
                        break; // Exit the loop if parsing is successful
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Please enter an integer.");
                    }
                }             
                System.out.println("--------------------------------------");
                System.out.println("\n\n");
                
                switch(choice)
                {
                    //Add Staff
                    case 1: 
                            
                        
                        System.out.print("Please Enter Staff Name : ");
                        String name = sc.nextLine();
                        name = name.toUpperCase();
                        System.out.print("Please Enter Staff Contact Number : ");
                        String contact = sc.nextLine();
                        System.out.print("Please Enter Staff Password : ");
                        String password = sc.nextLine();                        
                        double staff_salary = 0;
                        while (true) 
                        {
                            try 
                            {
                                System.out.print("Please Enter Staff Salary : ");
                                staff_salary = Double.parseDouble(sc.nextLine());
                                break; // Exit the loop if parsing is successful
                            } 
                            catch (NumberFormatException e) 
                            {
                                System.out.println("Please enter a double.");
                            }
                        }

                        //generate random id for staff
                        System.out.println("Staff name " + name + ". ");
                        Random random = new Random();
                        String staff_id = "S" + random.nextInt();
                        Boolean checkId = true;
                        while(checkId)
                        {
                            id = "S" + random.nextInt();
                            checkId = false;

                            for(int i = 0; i < staff.size(); i++)
                            {
                                Staff f = staff.get(i);           

                                if(id.compareTo(f.getId()) == 0)
                                {
                                    checkId = true;
                                }                
                            }
                        }	
                        System.out.println("Staff ID is " + staff_id);
                        Staff s = new Staff(staff_id, password, name, contact, staff_salary);
                        
                        //add new staff to staff.txt                      
                        staff.add(s);
                        fhs.addToFile("staff.txt",sfile,null,staff,null,null);
                        

                        System.out.println("\n\n");
                        break;
                      
                    //Delete staff
                    case 2 :
                        
                        System.out.print("Enter Staff's ID Number to Delete : ");
                        String ID = sc.nextLine();
         
                        //delete staff record 
                         for(int i =0; i< staff.size(); i++)
                        {
                            Staff sid = staff.get(i);
                            if(ID.compareTo(sid.getId())==0) 
                            {
                                staff.remove(i);                              
                            }
                        }
                        fhs.deleteRecordFile(ID, sfile ,"staff.txt", customer, staff);
                       
                        System.out.println("\n\n");
                        break;
                        
                    //delete customer
                    case 3:
                        
                        System.out.print("Enter Customer's ID Number to Delete : ");
                        String customer_id = sc.nextLine();
                        
                        //delete customer record 
                        for(int i =0; i< customer.size(); i++)
                        {
                            Customer cid = customer.get(i);
                            if(customer_id.compareTo(cid.getId())==0)                                 
                            {
                                customer.remove(i);                              
                            }
                        }
                        fhc.deleteRecordFile(customer_id, cfile ,"customer.txt", customer, staff);
                       
                        System.out.println("\n\n");
                        break;
                        
                    //display staff list
                    case 4:
                        
                        //display header
                        System.out.println("\nStaff List");
                        System.out.println("No.//Id//Name//Contact//Pw//Salary");
                        
                        //display staff record from staff.txt
                        fhs.displayFile("staff.txt",null,staff,null,null,"staff");
                        
                        System.out.println("\n\n");
                        break;
                    
                        
                    //display customer list
                    case 5:
                        
                        //display header
                        System.out.println("\nCustomer List");
                        System.out.println("No.//Id//Name//Contact//Pw");
                        
                        //display staff record from staff.txt
                        fhc.displayFile("customer.txt",customer,null,null,null,"staff");
                        
                        System.out.println("\n\n");
                        break;
                        
                    //search by customer name
                    case 6:
                        
                        System.out.print("Please enter customer name : ");
                        String cn = sc.nextLine();
                        cn = cn.toUpperCase();
                        
                        System.out.println("\nCustomer List");
                        System.out.println("No.//Id//Name//Contact//Pw");
                        
                        fhc.searchFile("customer.txt", customer,null,null,null,cn,null,"staff");
                        
                        System.out.println("\n\n");
                        break;
                        
                    //search by customer id
                    case 7:
                        
                        System.out.print("Please enter customer id : ");
                        String ci = sc.nextLine();

                        System.out.println("\nCustomer List");
                        System.out.println("Id//Name//Contact//Pw");
                        
                        fhc.searchFile("customer.txt", customer,null,null,null,null,ci,"staff");
                                             
                        System.out.println("\n\n");
                        break;
                     
                    //search by staff name
                    case 8:
                        
                        System.out.print("Please enter staff name : ");
                        String sname = sc.nextLine();
                        sname = sname.toUpperCase();

                        System.out.println("\nStaff List");
                        System.out.println("No.//Id//Name//Contact//Pw//Salary");
                        
                        fhs.searchFile("staff.txt", null,staff,null,null,sname,null,"staff");
                                             
                        System.out.println("\n\n");
                        break;
                        
                    //search by staff id
                    case 9:
                        
                        System.out.print("Please enter staff id : ");
                        String si = sc.nextLine();

                        System.out.println("\nStaff List");
                        System.out.println("Id//Name//Contact//Pw//Salary");
                        
                        fhs.searchFile("staff.txt", null,staff,null,null,null,si,"staff");
                     
                        System.out.println("\n\n");
                        break;
                        
                    //exit to main 
                    case 0:
 
                        check = false;                       
                        break;
                }             
            }    
        }
        else if(id.charAt(0)== 'S')
        {
            for(int i =0; i< staff.size(); i++)
            {
                Staff sid = staff.get(i);
                if(id.compareTo(sid.getId())==0) 
                {
                    System.out.println("\n\nHi, " + sid.getName());                            
                }
            }
            System.out.println("======================================");
            System.out.println("|      This is a STAFF account.      |");
            System.out.println("======================================");
            
            while(check == true)
            {
                
                System.out.println("--------------------------------------");
                System.out.println("|  1) Update profile information     |");
                System.out.println("|  2) Inventory                      |");
                System.out.println("|  3) Sales                          |");
                System.out.println("|  4) Exit                           |");
                System.out.println("--------------------------------------");
                int choice = 0;
                while (true) 
                {
                    try 
                    {
                        System.out.print("Enter Your Choice : ");
                        choice = Integer.parseInt(sc.nextLine());
                        break; // Exit the loop if parsing is successful
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Please enter an integer.");
                    }
                }             
                System.out.println("--------------------------------------");
                System.out.println("\n\n");
                
                switch(choice)
                {
                    //update staff profile
                    case 1:
                        
                        for(int i =0; i < staff.size(); i++)
                        {
                            
                            Staff s = staff.get(i);
                            if(id.compareTo(s.getId())==0)
                            {
                                fhs.updateFile(id, "staff.txt",null,staff,null);
                            }
                        }
		
                        System.out.println("\n\n");
			break;
                        
                    //inventory main page
                    case 2:
                        
                        boolean case2 = true;
                        while(case2 == true)
                        {
                            System.out.println("--------------------------------------");
                            System.out.println("|  1) Add new art                    |");
                            System.out.println("|  2) List all inventory             |");
                            System.out.println("|  3) Update stock quantity          |");
                            System.out.println("|  4) Searh inventory by id          |");
                            System.out.println("|  5) Exit                           |");
                            System.out.println("--------------------------------------");
                            int decision = 0;
                            while (true) 
                            {
                                try 
                                {
                                    System.out.print("Enter Your Choice : ");
                                    decision = Integer.parseInt(sc.nextLine());
                                    break; // Exit the loop if parsing is successful
                                } 
                                catch (NumberFormatException e) 
                                {
                                    System.out.println("Please enter an integer.");
                                }
                            }             
                            System.out.println("--------------------------------------");
                            System.out.println("\n\n");
                            
                            switch(decision)
                            {
                                //add new art to inventory
                                case 1:
                                    
                                    System.out.print("Artist name : ");
                                    String artist_name = sc.nextLine();
                                    System.out.print("Art Title :");
                                    String art_title = sc.nextLine();
                                    System.out.print("Description : ");
                                    String art_description = sc.nextLine();
                                    System.out.print("Purchase price : ");
                                    double art_pprice = sc.nextDouble();
                                    System.out.print("Selling price : ");
                                    double art_sprice = sc.nextDouble();
                                    System.out.print("Stock quantity : ");
                                    int art_stock = sc.nextInt();
                                    
                                    //generate id for inventory
                                    String art_id = "I" + inventory.size()+1;
                                    
                                    
                                    inventory.add(new Inventory(art_id,artist_name, art_title, art_description, art_pprice, art_sprice, art_stock));
                                    fhi.addToFile( "inventory.txt", ifile, null,null,inventory,null);
                                    
                                    
                                    System.out.println("\n\n");
                                    break;
                                    
                                //list all inventory
                                case 2:
                                    
                                    System.out.println("\nInventory List");
                                    System.out.println("No.//ID//Artist//Art Name//Description//Purchase Price//SellingPrice//Available Stock");                                   
                        
                                    fhi.displayFile("inventory.txt",null,null,inventory,null,"staff");

                                    System.out.println("\n\n");
                                    break;
                                  
                                //update stock quantity
                                case 3:
                                    
                                    Boolean stockList = false;
                                    System.out.println("\nInventory List");
                                    fhi.displayFile("inventory.txt",null,null,inventory,null,"staff");
                                    System.out.print("Enter art ID to update stock : ");
                                    String inventory_id = sc.nextLine();
                                    for(int i = 0; i < inventory.size(); i++)
                                    {
                                        Inventory inv = inventory.get(i);
                                     
                                        if(inventory_id.compareTo(inv.getInventoryId())==0)
                                        {
                                            System.out.println("Art title : " + inv.getTitle());
                                            System.out.println("Artist : " + inv.getArtist());
                                            System.out.println("Current stock: " + inv.getStock());

                                            fhi.updateFile(inventory_id, "inventory.txt" , null , null , inventory);
                                            stockList = true;
                                            break;
                                        }
                                        

                                    }
                                    if(stockList == false )
                                    {
                                        System.out.println("No record found!");
                                    }
                                    
                                    System.out.println("\n\n");
                                    break;
                                    
                                //search inventory by id
                                case 4:
                                    
                                    System.out.print("Please enter Inventory ID : ");
                                    String ii = sc.nextLine();
                                    ii = ii.toUpperCase();
                                    
                                    System.out.println("\nID//Artist//Art Name//Description//Purchase Price//SellingPrice//Available Stock");       
                                    fhi.searchFile("inventory.txt", null,null,inventory,null,null,ii,"staff");

                                    System.out.println("\n\n");
                                    break;
                                    
                                //back to staff main
                                case 5:
                                    
                                    case2 = false;
                                    System.out.println("\n\n");
                                    break;
                                    
                                                                       
                            }
                        }
                        break;
                    
                    //sales main page
                    case 3:
                        
                        boolean case3 = true;
                        while(case3)
                        {
                            System.out.println("--------------------------------------");
                            System.out.println("|  1) List all sales                 |");
                            System.out.println("|  2) Search sales                   |");
                            System.out.println("|  3) Exit                           |");
                            System.out.println("--------------------------------------");
                            int decision = 0;
                            while (true) 
                            {
                                try 
                                {
                                    System.out.print("Enter Your Choice : ");
                                    decision = Integer.parseInt(sc.nextLine());
                                    break; // Exit the loop if parsing is successful
                                } 
                                catch (NumberFormatException e) 
                                {
                                    System.out.println("Please enter an integer.");
                                }
                            }             
                            System.out.println("--------------------------------------");
                            System.out.println("\n\n");
                            
                            switch(decision)
                            {
                                //list all sales
                                case 1:
                                    
                                    System.out.println("Sales List");
                                    System.out.println("No.//Receipt Id//Inventory Id//Customer Id//Purchased Price//Sold Price//Date");
                                    fhr.displayFile("receipt.txt",null,null,null,receipt,"staff");

                                    System.out.println("\n\n");
                                    break;
                                    
                                //search sales by id
                                case 2:
                                    
                                    System.out.print("Please enter receipt id : ");
                                    String ii = sc.nextLine();
                                    ii = ii.toUpperCase();

                                    System.out.println("\nSales List");
                                    System.out.println("Receipt Id//Inventory Id//Customer Id//Purchased Price//Sold Price//Date");

                                    fhr.searchFile("receipt.txt", null,null,null,receipt,null,ii,"staff");
                        

                                    System.out.println("\n\n");
                                    break;
                                    
                                //back to staff main
                                case 3:
                                                                       
                                    case3 = false;
                                    System.out.println("\n\n");
                                    break;
                                    
                                                                       
                            } 
                        }
                        break;
                    
                    //back to main 
                    case 4:
                        
                        check = false;
                        System.out.println("\n\n");
                        break;
                }
            }           
        }
        else
        {
            for(int i =0; i< customer.size(); i++)
            {
                Customer cid = customer.get(i);
                if(id.compareTo(cid.getId())==0) 
                {
                    System.out.println("\n\nHi, " + cid.getName());                            
                }
            }
            System.out.println("\n\n======================================");
            System.out.println("|     This is a CUSTOMER account.    |");
            System.out.println("======================================");
            
            while(check == true)
            {
                System.out.println("--------------------------------------");
                System.out.println("|  1) Update profile information     |");
                System.out.println("|  2) Display Artwork                |");
                System.out.println("|  3) Searh art work by Artist       |");
                System.out.println("|  4) Purchase                       |");
                System.out.println("|  5) View receipt                   |");
                System.out.println("|  6) Exit                           |");
                System.out.println("--------------------------------------");
                int choice = 0;
                while (true) 
                {
                    try 
                    {
                        System.out.print("Enter Your Choice : ");
                        choice = Integer.parseInt(sc.nextLine());
                        break; // Exit the loop if parsing is successful
                    } 
                    catch (NumberFormatException e) 
                    {
                        System.out.println("Please enter an integer.");
                    }
                }             
                System.out.println("--------------------------------------");
                System.out.println("\n\n");
                
                switch(choice)
                {
                    //update customer profile
                    case 1 :
                        
                        for(int i =0; i < customer.size(); i ++)
                        {
                            Customer c = customer.get(i);
                            if(id.compareTo(c.getId())==0)
                            {
                                fhc.updateFile(id, "customer.txt",customer,null,null);
                            }
                        }
		
                        System.out.println("\n\n");
			break;
                     
                    //list all art
                    case 2:

                        System.out.println("\n\nArt List");
                        
                        fhi.displayFile("inventory.txt",null,null,inventory,null,"customer");
                        
                        System.out.println("\n\n");
                        break;
                        
                    //search art by author
                    case 3:
                        
                        System.out.print("Please enter Artist name : ");
                        String an = sc.nextLine();
                        an = an.toUpperCase();
                        
                        fhi.searchFile("inventory.txt", null,null,inventory,null,an,null,"customer");
                        
                        System.out.println("\n\n");
                        break;
                     
                    //purchase an artwork
                    case 4:
                        
                        Boolean buyList = false;
                        System.out.println("\nArt List");
                        
                        fhi.displayFile("inventory.txt",null,null,inventory,null,"customer");
                        
                        System.out.print("Enter art ID to buy : ");
                        String art_id = sc.nextLine();
                        
                        
                        for(int i = 0; i < inventory.size(); i++)
                        {
                            Inventory inv = inventory.get(i);
                            if (art_id.compareTo(inv.getInventoryId())== 0)
                            { 
                                buyList = true;
                                if(inv.getStock()==0)
                                {
                                    System.out.println("Out of stock!");
                                }
                                else
                                {
                                    System.out.print("\nPress enter key to pay...");
                                    try {
                                        System.in.read();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    
                                    System.out.println("\nPlease wait while payment processing...");
                                    
                                    try {
                                        Thread.sleep(5000); // Wait for 5 seconds
                                    } catch (InterruptedException e) {
                                        // Handle the exception
                                        e.printStackTrace();
                                    }
                                    System.out.println("Payment done");
                                    
                                    
                                    //add to receipt
                                    for(int c =0; c < customer.size(); c ++)
                                    {
                                        Customer cust = customer.get(c);
                                        if(id.compareTo(cust.getId())==0)
                                        {
                                            int receipt_id = receipt.size() + 1;
                                            String rid = "R" + receipt_id;
                                            LocalDate date = LocalDate.now();
                                            String dateString = date.toString();
                                         
                                            
                                            Receipt r = new Receipt(rid,cust.getId(),inv.getInventoryId(),inv.getPurchasePrice(),inv.getSellingPrice(),dateString);
                                            receipt.add(r);
                                            fhr.addToFile("receipt.txt", rfile,null, null, null, receipt);
                                            fhr.searchFile("receipt.txt", null,null, null, receipt, null, rid, "customer");
                                            
                                        }
                                    }
                                    
                                    System.out.println("Art name: " + inv.getTitle());                                   
                                    fhi.autoUpdateFile(art_id, inventory);
                                    
                                }
                            }                   
                        }
                        if(buyList == false)
                        {
                            System.out.println("No record found!!");
                        } 
                        
                        System.out.println("\n\n");
                        break;
                    
                    //view buy
                    case 5:
                        
                        System.out.println("Receipt");
                        fhr.searchFile("receipt.txt",null,null,null,receipt,null, id,"customer");
                        
                        System.out.println("\n\n");
                        break;
                        
                    //back to main
                    case 6:
                        
                        check=false;
                        
                        System.out.println("\n\n");
                        break;
                }        
            }                     
        }        
    }
}