import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalExpressionException, IOException {
    	
    	String inputExpression;
    	
    	FileReader reader = new FileReader();
    	inputExpression = reader.getExpression("C:/file.txt"); //or declare inputExpression
    	System.out.println("Input Expression = " + inputExpression);
        InfixToPostfix itp = new InfixToPostfix(inputExpression);
        List<Token> tokenList = itp.convert();
        System.out.println("Postfix form: ");
        for (Token token : tokenList)
            System.out.println(token);
        Interpreter interpreter = new Interpreter(tokenList);
        int result = interpreter.calculate();
        System.out.println("Result: " + result);
    }

}
