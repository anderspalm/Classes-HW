/**
 * Created by andeski on 6/27/16.
 */
public class Song {

    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song()
    {}

    public Song(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

}
