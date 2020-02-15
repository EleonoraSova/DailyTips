package lv.eleonora;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class TestTips2 {

	public static void main(String[] args) throws Exception {
		
		int totalLines = 0;
		File file = new File("tips.txt");
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader(file));
		
		while ((br.readLine()) != null) {
			totalLines++;
			
		}
		br.close();
		
		System.out.println(totalLines);
		
		Random random = new Random();
		int randomInt = random.nextInt(totalLines);
		System.out.println(randomInt);
		
		br.readLine();
		

	}

}
