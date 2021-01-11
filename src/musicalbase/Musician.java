/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;

/**
 *
 * @author Omaiey
 */
public class Musician {
    private int ssn;
    private String firstName;
    private String lastName;
    private String address;
    private long phone;

    public Musician(){
        this.ssn = 0;
        this.firstName = null;
        this.lastName = null;
        this.address = null;
        this.phone = 0;
    }
    
    public Musician(int ssn, String firstName, String lastName, String address, long phone){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;       
    }
    
    public int getSsn(){
        return ssn;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public long getPhone(){
        return phone;
    }
    
    
}
