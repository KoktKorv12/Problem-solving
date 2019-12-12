import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int fuel = 0;
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int totalfuel = 0;
        for (int i = 0; i <= 99; i++) {
            int mass = in.nextInt();
            fuel = mass / 3;
            Math.round(fuel);
            fuel = fuel - 2;
            totalfuel = totalfuel + fuel;
            while (fuel > 0) {
                fuel = fuel / 3;
                Math.round(fuel);
                fuel = fuel - 2;
                if(fuel >= 0) {
                    totalfuel += fuel;
                    System.out.println(fuel);
                }
                System.out.println(totalfuel);
        }
        }
    }
}