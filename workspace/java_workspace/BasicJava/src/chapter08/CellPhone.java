package chapter08;

//부모클래스
public class CellPhone {
	    String model;
		String color;
		
		public void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		
		public void powerOff() {
			System.out.println("전원을 끕니다.");
			
		}
		
		public void bell() {
			System.out.println("벨이 울립니다");
		}
		
		public void sendVoice(String message) {
			System.out.println("자기"+ message);
		}
		
		public void receiveVoice(String message) {
			System.out.println("상대방:"+message);
		}
		
		public void hang() {
			System.out.println("전화를 끊습니다.");
			
		}
		
		
}//클래스

