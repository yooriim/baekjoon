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
		int n = Integer.parseInt(br.readLine());
		int result = n;
		for(int i=0;i<n;i++) {
			if(result>0) {
				bw.write(result+"\n");				
				result-=1;		
			}else {
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}