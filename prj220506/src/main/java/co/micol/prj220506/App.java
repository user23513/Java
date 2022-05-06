package co.micol.prj220506;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import co.micol.prj220506.stack.StackEx;

public class App 
{
    public static void main( String[] args )
    {
//        StackEx stack = new StackEx();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.pop();

    	try {
//			OutputStream os = new FileOutputStream("c:\\temp\\a.txt");
    		Writer os = new FileWriter("c:\\temp\\a.txt");
//			byte a = 62;
//			byte b = 63;
//			byte c = 64;
    		String str = "abcdef";
    		
    		os.write(str);
			
//			os.write(a);
//			os.write(b);
//			os.write(c);
			
			os.flush();
			os.close();
			
			Reader reader = new FileReader("c:\\temp\\a.txt");
//			String rstr = reader.toString();
//			System.out.println(rstr);		
			char[] buffer = new char[100];
			while(true) {
				int charNum = reader.read(buffer);
				if(charNum == -1) break; //파일 끝을 만나면 EOF
				for(int i = 0 ; i<charNum;i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
