import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result=0;
		for(int i=0;i<5;i++) {
			int a=Integer.parseInt(st.nextToken());
			result+=a*a;
		}		
		result = result%10;
		
		bw.write(result+"");
		bw.flush();
		bw.close();
		br.close();
	}

}