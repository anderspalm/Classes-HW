/**
 * Created by andeski on 6/27/16.
 */

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    String mName;
    List<Song> mSongs = new ArrayList<>();

    public Playlist() {}

    public Playlist(String name, List<Song> songs) {
        mSongs = songs;
        mName = name;
    }

    public void addName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public int getsize() {
        return mSongs.size();
    }

    public void addSong(Song songs) {
        mSongs.add(songs);
    }

    public Song getsong(int num) {
        return mSongs.get(num);
    }

//    public Song getName(int num) {
//        return mName.get(num);
//    }

    public void PlayAll() {
//        for(int i = 0; i < mSongs.size(); i ++) {
//            Play();
//        }
    }


}
