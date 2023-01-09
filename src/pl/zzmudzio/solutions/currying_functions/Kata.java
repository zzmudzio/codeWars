package pl.zzmudzio.solutions.currying_functions;

import java.util.function.Function;

public class Kata {
    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                int[] values = new int[array.length];
                for(int element = 0; element < array.length; element++)
                {
                    values[element] = array[element] * integer;
                }
                return values;
            }
        };
    }
}
