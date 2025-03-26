import java.util.*;
public class TestSong {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Song Name: ");
        String songName = reader.nextLine();
        System.out.println("Enter Song Artist: ");
        String artist = reader.nextLine();
        System.out.println("Enter Song length: ");
        int length = reader.nextInt();
        Song shir2 = new Song(songName, artist, length);

        System.out.println("The song category is: " + shir2.category());

        shir2.increaseLength(40);

        System.out.println(shir2.toString());

        System.out.println("Enter New Name: ");
        String newName = reader.next();
        shir2.setName(newName);

        System.out.println("The song name is: " + shir2.getName());

        System.out.println(shir2.toString());
    }
}
