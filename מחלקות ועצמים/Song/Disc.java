import java.util.*;
public class Disk {
    public static Scanner reader = new Scanner(System.in);
    private String name;
    private Song[] playlist;


    /* פעולות בונות */
    public Disk(String name, Song[] playlist){
        this.name = name;
        this.playlist = playlist;
    }

    public Disk() {
        System.out.println("enter name for disk:");
        this.name = reader.next();
        System.out.println("Enter disk length: ");
        int songCount = reader.nextInt();
        this.playlist = new Song[songCount];
        System.out.println("Enter songs:");
        for (int i = 0; i < this.playlist.length; i++) {
            playlist[i] = new Song();
        }
    }

    /* פעולות מאחזרות */
    public String getName() {
        return this.name;
    }

    public Song[] getDisk() {
        return this.playlist;
    }

    public Song getSong(int place) {
        return this.playlist[place];
    }

    /* פעולות קובעות */
    public void setName(String name) {
        this.name = name;
    }

    public void setDisk(Song[] playlist) {
        this.playlist = playlist;
    }

    public void setSong(Song songToAdd, int place) {
        this.playlist[place] = songToAdd;
    }

    /* פעולות חישוביות */
    public String toString() {
        String str = "Disk name: " + this.name + " Songs: \n";
        Song s;
        for (int i = 0; i < this.playlist.length; i++) {
            s = playlist[i];
            str += s.toString + "\n";
        }
    }

    public int diskLength() {
        int length = 0;
        Song s;
        for (int i = 0; i < this.playlist.length; i++) {
            s = playlist[i];
            length += s.getLength();
        }
        return length;
    }

    public double averageSongLength() {
        return this.diskLength()/this.playlist.length;
    }
}