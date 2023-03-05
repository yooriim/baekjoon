import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int a1 =(int) ((a%10)*100+Math.floor((a*0.1)%10)*10+Math.floor((a*0.01)%10));
		int b1 =(int) ((b%10)*100+Math.floor((b*0.1)%10)*10+Math.floor((b*0.01)%10));

		System.out.println(a1>b1?a1:b1);
		
		
	}
	

}
