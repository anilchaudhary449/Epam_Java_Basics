package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        int max;
        if(values!=null && values.length>0) {
            max = values[0];
            for (int value : values)
                if (max < value)
                    max = value;
            return OptionalInt.of(max);
        }else {
            return OptionalInt.empty();
        }
    }
}
