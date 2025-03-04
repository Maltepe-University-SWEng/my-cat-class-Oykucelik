package tr.edu.maltepe.oop;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Cat {
    public int age;
    public String name;

    public Cat(int age, String name) {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        try {
            File soundFile = new File("C:\\Users\\coderoyku\\IdeaProjects\\my-cat-class-Oykucelik\\module1\\src\\meow.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();


            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

