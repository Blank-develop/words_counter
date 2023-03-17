import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your paragraph: ");
        String userInput = scan.nextLine();
        scan.close();

        ArrayList<String> words = new ArrayList<>();
        for(String str :  userInput.split(" ")) {
            if(str.length() > 0) words.add(str); //account for empty strings made by .split()
        }
        System.out.println("Word Count: " + words.size());

    }
}