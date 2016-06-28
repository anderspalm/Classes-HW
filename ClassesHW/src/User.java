import java.util.HashMap;

/**
 * Created by andeski on 6/27/16.
 */

public class User {

    String mName;
    HashMap<String, Playlist> mPlaylists;

    public User(String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylists.put(playlist.getName(),playlist);
    }

    public HashMap getAllPlaylistNames() {
        return mPlaylists;
    }

    public Playlist getPlaylistByName(String name) {
       for(int i = 0; i < mPlaylists.size(); i ++) {
           if (mPlaylists.get(i).equals(name)) {
               return mPlaylists.get(name);
           }
           else {
               return null;
           }
       }
        return null;
    }



}
