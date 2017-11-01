
public class Addition implements Operator {

	@Override
	public String handleOperator(int x, int y) {
		return Integer.toString(x + y);
	}

}
