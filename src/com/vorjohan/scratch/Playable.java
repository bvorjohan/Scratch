package com.vorjohan.scratch;

/**
 * Created by Bradley on 5/25/2017.
 */
public interface Playable {
    String path="";
    String title="";
    String artist="";
    String album="";
    int length=0;



    public void play();
    public void pause();


}
