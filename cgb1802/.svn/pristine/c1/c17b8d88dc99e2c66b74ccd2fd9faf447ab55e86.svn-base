package tedu.day04;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//新建工厂对象
		//用工厂来创建解析器对象
		//新建数据处理器对象
		//用解析器解析xml
		
		SAXParserFactory f = 
		 SAXParserFactory.newInstance();
		SAXParser p = f.newSAXParser();
		
		EmailHandler h = new EmailHandler();
		
		p.parse(
		  Test1.class.getResource("/email.xml").getPath(), 
		  h);
	}
}





