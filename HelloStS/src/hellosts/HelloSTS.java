package hellosts;

public class HelloSTS {

	public static void main(String[] args) {
		String nome = "STS"; 
		if (args.length > 0) {
			nome = args[0];
		}
		System.out.println("Hello, " + nome);

	}

}
