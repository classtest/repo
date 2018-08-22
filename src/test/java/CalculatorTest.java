import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }

	@Test
	public void testAdd1Plus1() {
		int y = 1;
		assertEquals(0, myClass.add(null,y));
	}
}
