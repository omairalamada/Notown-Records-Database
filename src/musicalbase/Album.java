/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;

import java.sql.Date;

/**
 *
 * @author Omaiey
 */
public class Album {
    private int albumID;
    private String title;
    private String format;
    private Date copyrightDate;
    private int ssn;
    private String fName;
    
    public Album(int albumID, String title, String format, Date copyrightDate, int ssn, String fName){
        this.albumID = albumID;
        this.title = title;
        this.format = format;
        this.copyrightDate = copyrightDate;
        this.ssn = ssn;
        this.fName = fName;
    }
    
    public int getAlbumID(){
        return albumID;
    }
    public String getTitle(){
        return title;
    }
    public String getFormat(){
        return format;
    }
    public Date getCopyrightDate(){
        return copyrightDate;
    }
    public long getSsn(){
        return ssn;
    }
    public String getFirstName(){
        return fName;
    }
}
