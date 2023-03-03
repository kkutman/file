import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("songFile");
            Scanner scanner = new Scanner(file);
            String files = scanner.nextLine();
            String[]arrays = files.split("-");
            Song song = new Song();
            for (int i = 0; i < arrays.length; i++) {
                song.setTitle(arrays[0]);
                song.setAuthor(arrays[1]);
                song.setText(arrays[2]);
            }
            System.out.println(song);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}