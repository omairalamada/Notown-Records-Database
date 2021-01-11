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
public class Performer {
    private int performerID;
    private int musicianSSN;
    private int songID;
    private int instID;
    
    public Performer(int performerID, int musicianSSN, int songID, int instID){
        this.performerID = performerID;
        this.musicianSSN = musicianSSN;
        this.songID = songID;
        this.instID = instID;
    }
    
    public int getPerformerID(){
        return performerID;
    }
    public int getSsn(){
        return musicianSSN;
    }
    public int getSongID(){
        return songID;
    }
    public int getInstID(){
        return instID;
    }    
}
