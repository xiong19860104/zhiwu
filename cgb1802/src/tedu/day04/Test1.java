package tedu.day04;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//�½���������
		//�ù�������������������
		//�½����ݴ���������
		//�ý���������xml
		
		SAXParserFactory f = 
		 SAXParserFactory.newInstance();
		SAXParser p = f.newSAXParser();
		
		EmailHandler h = new EmailHandler();
		
		p.parse(
		  Test1.class.getResource("/email.xml").getPath(), 
		  h);
	}
}





