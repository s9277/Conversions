import java.util.ArrayList;
import java.util.Collections;

public class Conversion {

	public static void convertFromDecimal(int input, int exponent) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		while (input>0) {
			output.add(Math.floorMod(input, exponent));
			input = Math.floorDiv(input, exponent);
		}
		Collections.reverse(output);
		System.out.print(output);
	}
}
