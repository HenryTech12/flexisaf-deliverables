import com.exceptions.demo.CustomException;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //catch custom exception
        try {
            catchCheckedException();
        } catch (CustomException customException) {
            System.out.println(customException.getMessage());
        }

        //catch custom exception with try resource
        File file = new File("fie.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } catch (CustomException | IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

        //throw exception
    public void getName(String name) {
        if(name == null)
            throw new NullPointerException("name is null");
        else
            System.out.println(name);
    }

    public static void catchCheckedException() throws CustomException  {
        System.out.println("catch checked exception thrown....");
    }
}