package it.mario.tdd;

/**
 * Created by mario on 04/07/14.
 */
public class Pair {
    String from;
    String to;

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        Pair pair = (Pair) o;
        return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
