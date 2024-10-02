package audio;

import game.AdventureGame;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class SoundPlayerUsingClip {
    private Clip clip;
    Thread thread;
    public  void playSound(String fileName) {
                try
                {
                    clip = AudioSystem.getClip();
                    File musicPath = new File("res/sfx/" + fileName);

                    if (musicPath.exists())
                    {
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        clip.open(audioInput);

                        switch (fileName) {
                            case "shop.wav" -> {
                                setVolume(0.05F);
                                clip.loop(Clip.LOOP_CONTINUOUSLY);
                            }
                            case "pokebat.wav" -> {
                                setVolume(0.03F);
                            }
                            case "music.wav", "wizard.wav" -> {
                                setVolume(0.03F);
                                clip.loop(Clip.LOOP_CONTINUOUSLY);
                            }
                            case "wizRec.wav", "wizRestock.wav", "startWiz.wav", "mer.wav", "merRestock.wav" ->{
                                setVolume(0.7F);
                            }
                            default -> setVolume(0.3F);
                        }


                        clip.start();



                    } else {
                        System.out.println("Cant find file");
                    }
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
    }


    public void stop()
    {
        clip.stop();
        clip.close();
    }


    public float getVolume()  {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        return (float) Math.pow(10F, gainControl.getValue() / 20F);
    }

    public void setVolume(float volume) {
        if (volume < 0F || volume > 1F)
            throw new IllegalArgumentException("Volume not valid: " + volume);
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(20F * (float) Math.log10(volume));
    }


    // MAKE THREADED
    public void fade(float volume, int millis) {
        setVolume(0.003F);
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {}
        setVolume(volume);
    }


}