import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		String s = Integer.toString(m);
		
		for(int i=0;i<10;i++) {
			int result = 0;			
			
			for(int j=0;j<s.length();j++) {
				if(Character.getNumericValue(s.charAt(j))==i) {
					result++;
				}								
			}
			
			System.out.println(result);			
		}		
	}
}