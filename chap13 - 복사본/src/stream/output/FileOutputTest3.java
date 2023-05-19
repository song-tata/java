package stream.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputTest3 {

	public static void main(String[] args) throws IOException {

		try(FileWriter fw = new FileWriter("한글가능.txt")){
			fw.write('A');
			char buf[]= {'B','C','Z'};
			fw.write(buf);
			fw.write("안녕하세요");
			fw.write('\n');
			fw.write(buf, 1, 2);
			fw.write("6");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
