package com.vorjohan.scratch;

import javax.sound.sampled.*;
import java.io.*;

//https://stackoverflow.com/questions/3780406/how-to-play-a-sound-alert-in-a-java-application?rq=1

/**
 * Created by Bradley on 5/25/2017.
 */
public class Song implements Playable{

    String path="";
    String title="";
    String artist="";
    String album="";
    int length=0;

    public Song(String path){
        this.path = path;

    }


    @Override
    public void play() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.path));
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                try {
                    clip.start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    clip.drain();
                } finally {
                    clip.close();
                }
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } finally {
                audioInputStream.close();
            }


        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void play2(){
        return;
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(this.path));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clip.close();

        try {
            audioInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pause() {

    }
}
