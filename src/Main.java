import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static String reference = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
    static String line = "PAIN IS ONLY TEMPORARY BUT VICTORY IS FOREVER";
    public static void main(String[]args) {
        //TODO Remove from
        for(int i = 0; i < reference.length(); i ++) {
            System.out.print("\t" + reference.charAt(i));
        }
        System.out.println();
        for(int i = 0; i < reference.length(); i ++) {
            System.out.print("\t"+i);
        }
        System.out.println();System.out.println();
        for(int i = 0; i < line.length(); i ++) {
            System.out.print("\t"+line.charAt(i));
        }
        System.out.println();
        for(int i = 0; i < line.length(); i ++) {
            System.out.print("\t"+reference.indexOf(line.charAt(i)));
        }
        System.out.println();System.out.println();
        for(int i = 0; i < line.length()-1; i ++) {
            System.out.print("\t"+distance(line.charAt(i),line.charAt(i+1)));
        }        System.out.println();System.out.println();
        //TODO Remove to
        double time = 1;
        double distance = 0;
        for(int i = 0; i < line.length()-1; i ++) {
            distance += distance(line.charAt(i),line.charAt(i+1));
            time += 1;
        }
        double timeRunning = (distance*60.0*Math.PI/28.0)/15.0;
        System.out.println(time+timeRunning);
    }

    private static int distance(char c, char c1) {
        int antiClockWiseMoves=Math.abs(reference.indexOf(c)-reference.indexOf(c1))-1;
        if(antiClockWiseMoves==-1)
            return 0;
        if(antiClockWiseMoves<reference.length()/2)
            return antiClockWiseMoves;
        return (reference.length()-2)-antiClockWiseMoves;
    }
}
