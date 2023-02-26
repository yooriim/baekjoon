import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int result=0;
		String a= br.readLine();
		for(int i=0;i<n;i++) {
			int b=Character.getNumericValue(a.charAt(i));
			result+=b;
		}
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}