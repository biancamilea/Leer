import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("carta.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int lineas = 0;
        int caract = 0;
        int palabras = 0;
        String linea = "";

        while ((linea = br.readLine()) != null){
            lineas ++;
            if (linea == null){
                continue;
            }
            palabras += linea.split(" ").length;
            for (String palabra :linea.split(" ")) {
                caract += palabra.split("").length;
            }
        }
        br.close();

        System.out.println("Total líneas: " + lineas);
        System.out.println("Total palabras: " + palabras);
        System.out.println("Total caracteres: " + caract);
    }
}