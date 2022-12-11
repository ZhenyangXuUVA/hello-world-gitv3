
public class HelloWorld {

	public static void main(String[] args) {
		
		//System.out.println("Welcome to Hello world project in git!");
		MyPrinter.print("Welcome to Hello world project in git!");
		
		//System.out.println("Tell me your name: ");
		MyPrinter.print("Tell me your name: ");
		
		MyScanner myScanner = new MyScanner();
		String input = myScanner.getInput();
		//System.out.println("Hello " + input + "!");
		MyPrinter.print("Hello " + input + "!");
	
	}

}
