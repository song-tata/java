package stream.output;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputTest4 {

	public static void main(String[] args) {
		int result;
		try(FileWriter fos = new FileWriter("구구단.txt")) {
			for(int i = 2;i < 10; i++) {
				fos.write("** "+i+"단 **\n");
				for(int j = 1; j< 10; j++) {
					result = i*j;
					fos.write(i+" x "+j+" = "+result+"\n");
				}
				fos.write("\n");
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

}
