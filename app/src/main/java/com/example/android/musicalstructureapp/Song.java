package com.example.android.musicalstructureapp;

/**
 * {@link Song} represents the songs.
 */
public class Song {

    /**
     * Default value for the album
     */
    private int mAlbumIcon;

    /**
     * Default value for the Song
     */
    private String mDefaultValue;

    /**
     * default value for the artist
     */
    private String mArtistValue;

    /**
     * default value for the picture/icon
     */
    private int mImageResourceId;

    /**
     * Create a new Song object.
     */
    public Song(int albumIcon, String defaultValue, String artistValue, int ImageResourceId) {
        mAlbumIcon = albumIcon;
        mDefaultValue = defaultValue;
        mArtistValue = artistValue;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the albumIcon.
     */
    public int getAlbumIcon() {
        return mAlbumIcon;
    }

    /**
     * Get the default Song.
     */
    public String getDefaulttranslation() {
        return mDefaultValue;
    }

    /**
     * Get the artist.
     */
    public String getArtistValue() {
        return mArtistValue;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
