import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

public class Oppg1b {
	
	public static int beregn(int a, int b, int c) {
		BiFunction<Integer, Integer, Integer> sum = (t, u) -> t+u;
		BiFunction<Integer, Integer, Integer> stoerst = (t, u) -> Math.max(t, u);
		BiFunction<Integer, Integer, Integer> forskjell = (t, u) -> Math.abs(t-u);
		
		int svar=0;
		if (c == 1) {
			svar = sum.apply(a, b);
		} else if (c == 2) {
			svar=stoerst.apply(a, b);
		} else if (c ==3) {
			svar = forskjell.apply(a, b);
		}
		return svar;
		
	}
	public static void main(String[] args) throws Exception, Exception {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(keyboard.readLine());
		int b = Integer.parseInt(keyboard.readLine());
		int c = Integer.parseInt(keyboard.readLine()); //1 sum, 2 stoerst, 3 forskjell
		
		System.out.println(beregn(a, b, c));
		
		
	}

}
