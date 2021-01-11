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
public class Play {
    private int playerID;
    private int ssn;
    private int instID;
    
    public Play(int playerID, int ssn, int instID){
        this.playerID = playerID;
        this.ssn = ssn;
        this.instID = instID;
    }
    
    public int getPlayerID(){
        return playerID;
    }
    public int getSsn(){
        return ssn;
    }
    public int getInstrumentID(){
        return instID;
    } 
    
}
