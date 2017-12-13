import java.io.*;

public class deccode {


        public static void main(String[] args) {

            if (args.length != 2) {
                System.out.println("Invalid number of arguments. Usage: src target");
            }

            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[0]));
                 BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(args[1]))) {

                int buffer;
                while ((buffer = in.read()) != -1) {
                    out.write(buffer - 5);
                }

                System.out.println("File Unencrypted!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

