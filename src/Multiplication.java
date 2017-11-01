
public class Multiplication implements Operator{
	@Override
	public String handleOperator(int x, int y) {
		return Integer.toString(x * y);
	}
}
