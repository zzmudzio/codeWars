package pl.zzmudzio.solutions.cubed_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        List<Integer> oddNumbers = new ArrayList<>();
        Arrays.stream(arr)
                .filter((int arrElement) -> Math.abs(arrElement%2)==1)
                        .forEach((int filteredElement) -> {
                            oddNumbers.add((int)Math.pow(filteredElement, 3));
                        });
        return oddNumbers.stream().mapToInt(Integer::intValue).sum();
    }
}
