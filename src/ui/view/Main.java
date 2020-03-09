package ui.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Geef getal");
        String divisor =
                new BufferedReader(new InputStreamReader(System.in)).readLine();
        try {
            System.out.println(3 / Integer.parseInt(divisor));
        } catch (ArithmeticException e) {
            throw new UIException("Je mag niet delen door 0.");
        } catch (NumberFormatException e) {
            throw new UIException("Problemen met parseint.");
        }
    }

}
