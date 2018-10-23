package githubtest2;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author cottrell.lee
 */
public class GitHubTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cottrell();
        DominicWasHere();
        LoganWasHere();
    }
    
     public static void Cottrell(){
        System.out.println("Lee Cottrell!!");
        System.out.println("Woo Hoo");
        System.out.println("Woo Hoo again");
    }
     
     public static void DominicWasHere(){
         System.out.print("Steppin on the beach!");
         Timer timer = new Timer();
         timer.schedule(new TimerTask(){
             public void run(){
                 try{
                    AudioInputStream audio = AudioSystem.getAudioInputStream(
                        new File("./Grass_Beach.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audio);
                    clip.start();
                } catch(Exception e){
                    System.out.println("Error Playing Audio File");
                }
             }
         }, 0, 15000);
     }
     
     public static void LoganWasHere() {
         System.out.println("\nLogan was here\nHello GitHub!");
     }
}
