package com.vorjohan.scratch;

/**
 * Created by Bradley on 7/18/2017.
 */

////////

public class ProjectRunner {

    public static void main(String[] args) {
        String path = "D:/Programs/iTunes Cache/Bring Me The Horizon/Live At The Royal Albert Hall/02 Happy Song.mp3";
        path = "C:/Users/Bradley/Desktop/sample.mp3";
        path = "D:/Programs/iTunes Cache/Paramore/All We Know is Falling/01 All We Know.mp3";
        Song song = new Song(path);
        song.play();
    }
}
