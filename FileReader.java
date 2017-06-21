import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
	
	public String getExpression(String FullFileName) throws IOException {
		
		FileInputStream fstream = new FileInputStream(FullFileName);
		BufferedReader br = new BufferedReader (new InputStreamReader(fstream));
		
		String Expression = "";
		String strLine;
		
		while ((strLine = br.readLine()) != null) {
			System.out.println(strLine);
			Expression = Expression.concat(strLine);	
		}
		
		return Expression;
		
	}
	
}
