
public class Division implements Operator {
	@Override
	public String handleOperator(int x, int y) {
		return Integer.toString(x / y);
	}
}
