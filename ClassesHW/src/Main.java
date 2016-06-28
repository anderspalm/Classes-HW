/**
 * Created by andeski on 6/27/16.
 */

import java.util.ArrayList;
import java.util.List;
public class Main extends Playlist{

    public static void main(String[] args) {
//        play();

    User usr = new User("Anders");

    Song music = new Song("Dark necessities", "Red Hot Chili Peppers", "The Getaway");

    Playlist playlist1 = new Playlist();
    Playlist playlist2 = new Playlist();

        Song one = new Song("Whispering winds","Orbital","Play & Play: B Sides");
        Song two = new Song("song2","artist2.","album2");
        Song three = new Song("song3","artist3.","album3");
        Song four = new Song("song4","artist4","album4");
        Song five = new Song("What You Know","Two Door Cinema Club","Tourist History");
        Song six = new Song("Something Good Can Work","Two Door Cinema Club","Tourist History");
        Song seven = new Song("Undercover Martyn","Two Door Cinema Club","Tourist history");

        playlist1.addSong(one);
        playlist1.addSong(two);
        playlist1.addSong(three);
        playlist1.addSong(four);
        playlist2.addSong(five);
        playlist2.addSong(six);
        playlist2.addSong(seven);

        usr.addPlaylist(playlist1);
        usr.addPlaylist(playlist2);

        playlist1.addName("lounge");
        playlist2.addName("Indie Rock");

        System.out.println(playlist1.getName());
        for(int i = 0; i < playlist1.getsize(); i ++ ) {
            Play(playlist1.getsong(i));
        }
        System.out.println("\n");
        System.out.println(playlist2.getName());
        for(int i = 0; i < playlist2.getsize(); i ++ ) {
            Play(playlist2.getsong(i));
        }
    }

    public static void Play(Song songs){
        String song = songs.getSongName();
        String artist = songs.getArtistName();
        String album = songs.getAlbumName();
        System.out.println("Song: " + song + "Artist: " + artist + "Album: " + album);

    }


}
