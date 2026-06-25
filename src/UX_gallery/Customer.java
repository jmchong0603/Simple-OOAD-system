/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

public class Customer extends User 
{
    public Customer(String id, String password, String name, String contact){
        super(id, password , name, contact);
        }

    @Override
    public String toString()
    {
        return super.toString() ;
    }
}