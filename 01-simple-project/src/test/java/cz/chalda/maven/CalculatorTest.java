package cz.chalda.maven;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add() {
      Calculator calc = new Calculator();
      Assert.assertEquals(2, calc.add(1, 1));
    }
    
    @Test
    public void addProperties() {
      Calculator calc = new Calculator();
      Assert.assertEquals(3, calc.addProperties());
    }
}
