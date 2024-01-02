package Practice;

import edu.princeton.cs.algs4.Queue;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.Arrays;

public class _23_QueneIntro {
    public static void main(String[] args) {
        Queue<Integer> numbers = new Queue<>();
        try (Scanner file = new Scanner(Paths.get("./Practice/nums.txt"))){
            while(file.hasNextLine()){
                numbers.enqueue(Integer.valueOf(file.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 

        int N = numbers.size();
        int[] arr = new int[N];
        for (int i = 0 ; i < N ; i++)
            arr[i] = numbers.dequeue();
        System.out.println(Arrays.toString(arr));
    }
}
