package Practice;

import edu.princeton.cs.algs4.Bag;
import java.util.Scanner;
import java.nio.file.Paths;

public class _22_BagIntro {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        try (Scanner file = new Scanner(Paths.get("./Practice/nums.txt"))){
            while(file.hasNextLine()){
                numbers.add(Double.valueOf(file.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int N = numbers.size();

        double sum = 0;
        for(double x : numbers) 
            sum += x;
        
        double mean = sum/N;

        sum = 0;
        for(double x : numbers)
            sum += (x-mean)*(x-mean);

        double var = sum/(N-1);
        double std = Math.sqrt(var);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.2f\n", std);
        System.out.printf("Variance: %.2f\n", var);
        
    }
}
