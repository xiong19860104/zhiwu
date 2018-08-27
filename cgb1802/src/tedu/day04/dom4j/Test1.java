package tedu.day04.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String path = 
		 Test1.class
		 .getResource("/email.xml").getPath();
		
		System.out.println(path);
		
		//读取xml生成dom树
		SAXReader reader = new SAXReader();
		Document doc = reader.read(path);
		//获得xml的根元素
		Element email = doc.getRootElement();
		f1(email);
		f2(email);
		f3(email);
		f4(email);
		f5(email);
		f6(email);
		f7(email);
		f8(email);
		f9(email);
	}

	private static void f1(Element email) {
		String from = email.elementText("from");
		String subject = email.elementText("subject");
		String body = email.elementText("body");
		String date = email.attributeValue("date");
		String time = email.attributeValue("time");
		System.out.println(date);
		System.out.println(time);
		System.out.println(from);
		System.out.println(subject);
		System.out.println(body);
	}

	private static void f2(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f3(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f4(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f5(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f6(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f7(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f8(Element email) {
		// TODO Auto-generated method stub
		
	}

	private static void f9(Element email) {
		// TODO Auto-generated method stub
		
	}
}








