package Behavioral.Strategy;

public class Context {
    private final Operation op;

    public Context(Operation op) {
        this.op = op;
    }

    public int execute(int num, int...numbs) {
        return op.doOperation(num, numbs);
    }
}
