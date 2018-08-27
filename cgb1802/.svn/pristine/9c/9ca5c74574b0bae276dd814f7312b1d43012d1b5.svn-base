package tedu.day04;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmailHandler extends DefaultHandler{
	private StringBuilder text = 
			new StringBuilder();
	
	//startE, endE, char...
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//第三个参数qName是标签名
		System.out.println("开始标签："+qName);
	}
	public void endElement(String uri, String localName, String qName) throws SAXException {
		String s = text.toString().trim();
		if(s.length() != 0) {
			System.out.println("完整文本：");
			System.out.println(s);
		}
		//清空StringBuilder
		text.delete(0, text.length());
		
		System.out.println("结束标签："+qName);
	}
	public void characters(char[] ch, int start, int length) throws SAXException {
		text.append(ch,start,length);
	}
}




