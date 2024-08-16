//import stuff here?
import java.lang.Math;
//Your code here
public class Program5
{
    public static void main(String[] args)
    {
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        int royale = 286;
        int koopaKing = 412;
        int pipeFrame = 361;
        int badwagon = 161;
        double royaleMpg = royale / 9.0;
        double koopaKingMpg = koopaKing / 40.0;
        double pipeFrameMpg = pipeFrame / 18.0;
        double badwagonMpg = badwagon / 11.0;
        System.out.println("Royale averaged " + Math.round(royaleMpg * 10) / 10.0 + " m/g");
        System.out.println("Koopa King averaged " + Math.round(koopaKingMpg * 10) / 10.0 + " m/g");
        System.out.println("Pipe Frame averaged " + Math.round(pipeFrameMpg * 10) / 10.0 + " m/g");
        System.out.println("Badwagon averaged " + Math.round(badwagonMpg * 10) / 10.0 + " m/g");
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g
*/
