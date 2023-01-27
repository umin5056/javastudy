package ex03_Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLMainClass {

	public static void main(String[] args) {
		// 
		try {
			// Document 생성
			File file = new File("/Users/woomin/Documents/storage", "product.xml");

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // product.xml을 분석(파싱)한 Document 객체

			// 최상위 요소 : <product> 태그
			Element root = document.getDocumentElement();

			// 최상위 요소의 하위 태그들 : <product> 태그
			List<Map<String, Object>> products = new ArrayList<>();
			NodeList nodeList = root.getChildNodes();
			for(int i=0; i<nodeList.getLength(); i++) {
				Node node = nodeList.item(i); // Node는 #text(줄바꿈을 의미)와 <product> 태그(Element) 중 하나이다.
				if(node.getNodeType() == Node.ELEMENT_NODE) { // Node가 <product> 태그인가?
					Map<String, Object> product = new HashMap<>();
					NodeList nodeList2 = node.getChildNodes();
					for(int j=0; j<nodeList2.getLength(); j++) {
						Node node2 = nodeList2.item(j); // Node2는 #text(줄바꿈을 의미)와 <model> <maker> <price> 태그(Element) 중 하나이다.
						if(node2.getNodeType() == Node.ELEMENT_NODE) { // Node2가 <model> <maker> <price> 태그(Element) 중 하나인가?
							String key = node2.getNodeName();	// ket는 model, maker, price를 의미
							product.put(key, node2.getTextContent());
						}
					}
					products.add(product); // ArrayList에 맵 추가
				}
			}
			System.out.println(products);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
