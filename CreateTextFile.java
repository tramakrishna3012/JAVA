import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {
        String data = "Rama is a good boy.";
        try (FileOutputStream fos = new FileOutputStream("TRAMA.txt")) {
            fos.write(data.getBytes());
            System.out.println("The file was created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}