package tedu.day04;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler{
	//保存Book对象的集合
	private List<Book> list = new ArrayList<>();
	private Book book;
	private String tagName;//标签名
	private StringBuilder text = 
			new StringBuilder();
	
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tagName = qName;
		
		//当前处理的开始标签是 <book>
		if("book".equals(qName)) {
			book = new Book();
			list.add(book);
			book.setIsbn(attributes.getValue(0));
		}
	}
	public void endElement(String uri, String localName, String qName) throws SAXException {
		String s = text.toString().trim();
		if(s.length() != 0) {
			//处理完整文本
			//String s = new String(ch,start,length);
			if("name".equals(tagName)) {
				book.setName(s);
			} else if("author".equals(tagName)) {
				book.getAuthors().add(s);
			} else if("publisher".equals(tagName)) {
				book.setPublisher(s);
			} else if("price".equals(tagName)) {
				book.setPrice(s);
			} else if("pages".equals(tagName)) {
				book.setPages(s);
			}
		}
		text.delete(0, text.length());
	}
	public void characters(char[] ch, int start, int length) throws SAXException {
		text.append(ch,start,length);
	}
	public List<Book> getList() {
		return list;
	}
}
