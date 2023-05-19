package stream.reader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeByte(100);
			dos.writeUTF("(●'◡'●)(●'◡'●)");
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeDouble(3.14);
			dos.writeInt(100);
			dos.writeUTF("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("쓰기 완료");
		
	
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			
			System.out.println(dis.readByte());
			System.out.println(dis.readUTF());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			
		// EOFException : 데이터를 읽어오는 과정에서 파일 끝에 도달하거나, 스트림이 닫히는 경우 발생
		// EndOfFile
		// 부모 예외로 처리하는것이 좋다. - 여러개의 에러를 하나의 catch문으로 처리가능
		}catch(IOException e ) {
			e.printStackTrace();
		}
		System.out.println("읽기 완료");
	}

}
