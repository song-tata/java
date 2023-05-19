package stream.output;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputTest5 {

	public static void main(String[] args) {

		try (FileWriter fos = new FileWriter("구구단2.txt")) {

			for (int i = 2; i < 10; i++) {
				fos.write("** " + i + "단 **\t");
			}
			fos.write("\n");
			for (int j = 1; j < 10; j++) {
				for (int i = 2; i < 10; i++) {
					fos.write(i + " x " + j + " = " + i * j + "\t");
				}
				fos.write("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
