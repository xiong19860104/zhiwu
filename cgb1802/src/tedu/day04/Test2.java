package tedu.day04;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Test2 {
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		String path = 
		 Test2.class
		 .getResource("/books.xml")
		 .getPath();
		
		System.out.println(path);
		
		//数据处理器
		BookHandler h = new BookHandler();
		SAXParserFactory
		.newInstance()
		.newSAXParser()
		.parse(path, h);
		
		//数据处理结束后，
		//在数据处理器内部已经生成集合
		//取出它内部的集合
		List<Book> list = h.getList();
		for (Book b : list) {
			System.out.println(b);
		}
	}
}





