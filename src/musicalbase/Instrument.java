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
public class Instrument {
    private int instID;
    private String instName;
    private String musicalKey;
    
    public Instrument(int instID, String instName, String musicalKey){
        this.instID = instID;
        this.instName = instName;
        this.musicalKey = musicalKey;
    }

    public Instrument(){
        this.instID = 0;
        this.instName = null;
        this.musicalKey = null;
    }
    
    public int getInstID(){
        return instID;
    }
    public String getInstName(){
        return instName;
    }
    public String getMusicalKey(){
        return musicalKey;
    } 
    
}
