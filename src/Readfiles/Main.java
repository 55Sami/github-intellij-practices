package Readfiles;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //3 options
        //1. BufferedReader + file reader = best for reading text files line-by-line
        //2.FileInputStream = best for binary files(eg images audio)
        //3. RandomAccessFiles = best for read/write specific portions of a large file

        //BufferedReader + FileReader

        String filePath = "/Users/samikshyaghimire/Desktop/JAVA//test.txt";

        try( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate File");
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");
        }
    }
}
