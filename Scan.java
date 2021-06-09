package EnteringTest;

import java.util.Scanner;

public class Scan {
    //Сканнер и разделитель полученного String
    public String[] splitter(){
        Scanner inputScanner = new Scanner(System.in);
        String input;
        input = inputScanner.nextLine();
        String[] inputReader = input.split(" ");
        return inputReader;
    }
}
