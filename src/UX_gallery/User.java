/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

import java.io.Serializable;

public class User implements Serializable{
    
    private String id;
    private String password;
    private String name;
    private String contact;
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
        
    public String getContact()
    {
        return contact;
    }
    public void setContact(String contact)
    {
        this.contact = contact;
    }
      
    public User(String id, String password, String name, String contact)
    {
        this.id = id;
        this.password = password;
        this.name = name;
        this.contact = contact;
    }
    
    @Override
    public String toString()
    {
        return id + "//" + name + "//" + contact + "//" + password ;
    }
    

}
