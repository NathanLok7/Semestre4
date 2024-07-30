package 22.2 EjemploStack
import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		
		st1.push(10);
		st1.push(20);
		st1.push(30);
		st1.push(40);
		st1.push(50);
		
		while(!st1.isEmpty())
			System.out.println(st1.pop());
	}
}
