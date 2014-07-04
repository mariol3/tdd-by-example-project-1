package it.mario.tdd;

/**
 * Created by mario on 04/07/14.
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
