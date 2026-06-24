package studyJava.middle;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemMain {

   public static void main(String[] args) {
      // 장바구니 - Item 타입 ArrayList 생성

      ArrayList<Item> cart = new ArrayList<Item>();
      // Item객체를 저장하는 가변 배열을 생성하시오
      
      // 상품 담기
      Item item1 = new Item("A000", "노트북", 1200000, 1);
      cart.add(item1);

      cart.add(new Item("A001", "마우스", 35000, 2)); // 위 두 문장을 하나로 합친것
      cart.add(new Item("A002", "키보드", 89000, 1));
      cart.add(new Item("A003", "모니터", 450000, 2));
      cart.add(new Item("A004", "USB허브", 25000, 3));

      // 장바구니 출력
      System.out.println("==============================================");
      System.out.println("\t\t   장바구니");
      System.out.println("==============================================");
      for (Item item : cart) {
         System.out.println(item);
      }

      int total = 0;
      for (Item item : cart) {
         total = total + item.getSubtotal();
      }
      System.out.println("==============================================");
      System.out.printf("총합계 : %,d원\n", total);
      
      // 특정 상품 수량 변경
      // cart.get(1).qty = 3;
      // System.out.println("마우스 수량 변경후 : " + cart.get(1));
      Scanner sc = new Scanner(System.in);
      System.out.print("상품코드 : ");
      String icode = sc.next();
      System.out.print("수량 : ");
      int iqty = sc.nextInt();
      boolean result = false;
      for (Item item : cart) {
    	  if(item.code.equals(icode)) {
    		  item.qty = iqty;
    		  result = true;
    	  }
      }
      
      if(result) {
		  System.out.println("변경완료!");
	  } else {
		  System.out.println("상품코드가 존재하지 않아요!");
	  }
      
      
      // 상품 제거 (Index 이용)
      System.out.println("\nUSB 허브 제거 전 크기 : " + cart.size());
      cart.remove(cart.size() - 1); // 마지막 상품 제거
      System.out.println("\nUSB 허브 제거 후 크기 : " + cart.size());
      
      // 5만원 이상 상품만 출력
      System.out.println("\n====5만원 이상 상품 출력====");
      for (int i = 0; i < cart.size(); i++) {
    	  if(cart.get(i).price >= 50000) {
    		  System.out.println("상품명 : " + cart.get(i).name + ", 가격 : " + cart.get(i).price);
    	  }
      }
      
//      for (Item item : cart) {
//    	  if (item.price >= 50000) {
//    		  System.out.println("상품명 : " + item.name + ", 가격 : " + item.price);
//    	  }
//      }
      
      // 총 수량 합산
      int sum = 0; 
      for (Item item : cart) {
    	  sum = sum + item.qty;
      }
      
      System.out.println(sum);
   }

}
