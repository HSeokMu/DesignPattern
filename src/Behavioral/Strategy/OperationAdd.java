package Behavioral.Strategy;

import java.util.Arrays;

public class OperationAdd implements Operation {
    @Override
    public int doOperation(int num, int... numbs) {
        return num + Arrays.stream(numbs).sum();
    }
}
