package org.example;
import org.junit.Test;
public class Maintest {

    @Test
    public void add() {
        Main main = new Main();
        int result = main.add(5, 4);
        assert result == 9;
    }

    @Test
    public void multiply() {
        Main main = new Main();
        int result = main.multiply(4, 4);
        assert result == 16;
    }

    @Test
    public void subtract() {
        Main main = new Main();
        int result = main.subtract(4, 3);
        assert result == 1;
    }
}


