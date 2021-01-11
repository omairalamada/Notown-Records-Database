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
public class Song {
    private int songID;
    private String title;
    private String author;
    private int albumID;
    
    public Song(int songID, String title, String author, int albumID){
        this.songID = songID;
        this.title = title;
        this.author = author;
        this.albumID = albumID;
    }
    
    public int getSongID(){
        return songID;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getAlbumID(){
        return albumID;
    }   
}
