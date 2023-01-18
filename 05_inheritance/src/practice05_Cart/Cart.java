package practice05_Cart;

public class Cart {

	private Product[] products;	//	Product 배열 선언
	private int prodCount;		// 실제로 Product에 저장된 갯수

	public Cart(int cartSize) {
		products = new Product[cartSize]; // Product 배열 생성
		prodCount = 0;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}

	// 물건 담기
	/*
	   addProduct(new Meat(1, "소고기", 5000))
	   addProduct(new Pizza(1, "고구마피자", 3000))
	   addProduct(new Noodle(1, "신라면", 1000))
	 */
	public void addProduct(Product product) {

		// 카트가 가득 차면 물건을 담지못한다.
		if(prodCount == products.length) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		
		// 카트에 물건 담기
		products[prodCount++] = product;
		
	}


	// 물건 빼기
	public void deleteProduct(int prodNo) {
		
		// 카트가 비어 있으면 뺄 물건이 없다.
		if(prodCount == 0) {
			System.out.println("카트에 물건이 없습니다.");
			return;
		}
		
		// 카트에서 물건 빼기
		for(int i = 0; i < prodCount; i++) {
			if(products[i].getProdNo() == prodNo) {
				products[i] = products[--prodCount]; // 마지막 물건을 뺀 물건 자리로 옮김
				break;
			}
			
		}
		
	}
}
