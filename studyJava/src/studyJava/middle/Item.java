package studyJava.middle;

public class Item {
	
	String name;   // 상품명
	int price;     // 가격
	int qty;       // 수량
	
	// 생성자
	public Item(String name, int price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	// 소계(가격 × 수량)
	public int getSubtotal() {
		return price * qty;
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return String.format("%-10s %,8d원 %3d개 %,10d원",
				name, price, qty, getSubtotal());
	}
}