package com.example.android.musicalstructureapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>() ;

//        list of songs, artists and pictures for view

        songs.add(new Song(R.drawable.kindofblue,"Song: Kind of Blue", "Artist: Miles Davis", R.drawable.playicon));
        songs.add(new Song(R.drawable.alovesupreme,"Song: A Love Supreme", "Artist: John Coltrane", R.drawable.playicon));
        songs.add(new Song(R.drawable.thewayup,"Song: The Way Up", "Artist: Pat Metheny Group", R.drawable.playicon));
        songs.add(new Song(R.drawable.sonny,"Song: Saxophone Colossus", "Artist: Sonny Rollins", R.drawable.playicon));
        songs.add(new Song(R.drawable.timeout,"Song: Time Out", "Artist: The Dave Brubeck Quartet", R.drawable.playicon));
        songs.add(new Song(R.drawable.ellington,"Song: Ellington at Newport", "Artist: Duke Ellington", R.drawable.playicon));
        songs.add(new Song(R.drawable.timesallgone,"Song: Time's All Gone", "Artist: Nick Waterhouse", R.drawable.playicon));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}




