import java.util.*;
import java.sql.DriverManager;
public class TranscriptMain {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        TranscriptView transcript = new TranscriptView("tranat", "1858423");
        System.out.println("Insert ID: ");
        String id = input.nextLine();
        transcript.transcript(id);
    }
}
