/**
 * @author Nandi Zhou
 * 2015��4��22��
 * 
 * Ҫ�����  ������  ��  �ڵ��� ֮��Ĺ�ϵ
 * ����������Ҫ��װһ���ڵ���
 * ���õ����У�
 * FileInputStream��FileOutputStream
 * BufferedStream
 * ByteArrayStream
 */
package javastudy.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream1 {

	public static void main(String[] args) throws Exception {

		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("data.txt"))));

		byte b = 3;
		int i = 12;
		char ch = 'f';
		float f = 3.33333333f;

		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);

		dos.close();
		
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
		
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		
		dis.close();
	}
}
