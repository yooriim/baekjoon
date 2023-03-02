import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int num = 1;
		for(int i=1;i<10;i++) {
			int a = Integer.parseInt(br.readLine());
			if(max<a) {
				max = a;
				num=i;
			}
		}
		bw.write(max+"\n"+num);
		bw.flush();
		bw.close();
		br.close();		
		
	}

}