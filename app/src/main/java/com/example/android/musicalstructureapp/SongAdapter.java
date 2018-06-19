package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song>  {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the albumIcon in the list_item.xml layout with the ID list_item_icon
        ImageView albumView = (ImageView) listItemView.findViewById(R.id.album_icon);
        // set the image to albumView
        albumView.setImageResource(currentSong.getAlbumIcon());

        // Find the TextView in the list_item.xml layout with the ID
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artists_view);

        artistTextView.setText(currentSong.getArtistValue());

        // Find the TextView in the list_item.xml layout with the ID
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.songs_view);

        defaultTextView.setText(currentSong.getDefaulttranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.play_icon);
        // set the image to iconView
        iconView.setImageResource(currentSong.getImageResourceId());

        // Return the whole list item layout
        // the ListView.
        return listItemView;
    }
}

