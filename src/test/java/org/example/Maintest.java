package org.example;
import org.junit.Test;
public class Maintest {

    @Test
    public void add() {
        Main main = new Main();
        int result = main.add(3, 4);
        assert result == 7;
    }

    @Test
    public void multiply() {
        Main main = new Main();
        int result = main.multiply(3, 4);
        assert result == 12;
    }

    @Test
    public void subtract() {
        Main main = new Main();
        int result = main.subtract(5, 3);
        assert result == 2;
    }
}


