package com.revztech.kotlinvariable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Song : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* textViewSongTitle = findViewById(R.id.songTitle)
        textViewGenre = findViewById(R.id.songGenre)
        textViewYear = findViewById(R.id.AlbumYear)
        textViewAlbumSold = findViewById(R.id.soldAlbum)
        textViewisGenreCR = findViewById(R.id.isGenreCR)
        textViewCassetteWg = findViewById(R.id.CassetteWg)
        */

        //assign values
        var Song: String = "Sweet Chile O' Mine"
        val Artist = "Bon Jovi"
        var YearReleased : Int = 1980
        var ampersandChar : Char = '@'
        var SongGenre : String = "Classic Rock"
        var AlbumSold : Double = 10000.1523423
        val isClassicRock : Boolean = true
        val CassetteTapeWeight : Float = 57.6f

        var tag : String? = "MainActivity"
        //var msg : String = Song.toString()

        /* Multiple comment
        textViewSongTitle.text = Song.toString()
        textViewGenre.text = SongGenre.toString()
        textViewYear.text = YearPublished.toString()
        textViewAlbumSold.text = AlbumSold.toString()
        textViewisGenreCR.text = isClassicRock.toString()
        textViewCassetteWg.text = CassetteTapeWeight.toString()
         */

        //printing differenct variable value on the console
        Log.d("Title String",Song.toString())
        Log.d("Artist",Artist.toString())
        Log.d("Genre String", SongGenre.toString())
        Log.d("Year Released Integer",YearReleased.toString())
        Log.d("Album Sold Double",AlbumSold.toString())
        Log.d("isClassic Rock Boolean",isClassicRock.toString())
        Log.d("Ampersand character",ampersandChar.toString() + YearReleased.toString())
        Log.d("Cassette Tape weight",CassetteTapeWeight.toString() + "g")
    }
}