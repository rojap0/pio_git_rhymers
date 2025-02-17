package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int TWELVE = 12;
    private static final int NEGATIVE_ONE = -1;
    public static final int ELEVEN = 11;
    private final int[] NUMBERS = new int[TWELVE];

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == NEGATIVE_ONE;
    }

    protected boolean isFull() {
        return total == ELEVEN;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return NUMBERS[total--];
    }

}
