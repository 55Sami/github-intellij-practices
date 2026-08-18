package WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //4 popular options
        //1.fileWriter = good for small or medium-sized text files
        //2.BufferedWriter = better performance for large amounts of text
        //3.PrintWriter = best for structured data, like reports or logs
        //4. FileOutputStream = best for binary files(eg images,audio files)

        //FileWriter

        String filePath ="/Users/samikshyaghimire/Desktop/JAVA//test.txt";
        String textContent = """
               Roses are red
               Violets are blue
               Booty Booty Booty
               Rockin' everywhere
                """;

        try( FileWriter writer = new FileWriter(filePath)){       //need to pass file path
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e ){
            System.out.println("Could not locate file location!");
        }
        catch(IOException e){
            System.out.println("Could not Write files");
        }

    }
}
