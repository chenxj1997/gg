import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test {
	public static void main(String[] args) {
		File file=new File("a.xml");
		SAXReader reader=new SAXReader();
		try {
			Document document=reader.read(file);
			Element root=document.getRootElement();
			System.out.println(root.asXML());
			Iterator<Element> it=root.elementIterator();
			while(it.hasNext())
			{
				System.out.println(it.next().getName());
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
