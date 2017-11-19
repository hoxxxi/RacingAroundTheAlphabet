import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String reference = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(in.readLine());
        String output = "";
        for(;c>0;c--)
        {
            String line = in.readLine();
            double distance = 0;
            for(int i = 0; i < line.length()-1; i ++) {
                distance += distance(line.charAt(i),line.charAt(i+1));
            }
            double timeRunning = (distance*60.0*Math.PI/28.0)/15.0;
            double timePicking = line.length();
            output+=timePicking+timeRunning+"\n";
        }
        System.out.println(output);
        in.close();
    }

    private static int distance(char c, char c1) {
        int antiClockWiseMoves=Math.abs(reference.indexOf(c)-reference.indexOf(c1));
        if(antiClockWiseMoves>=reference.length()/2) {
            return reference.length()-antiClockWiseMoves;
        }
        return antiClockWiseMoves;
    }
}
