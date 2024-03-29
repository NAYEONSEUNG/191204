package chapter05;


//싱글톤패턴
//:객체생성은 1회만하고 생성된 인스턴스를 빌려서 사용하는 방법
public class SingletonTest {
	
		//객체생성1회진행 -> st인스턴스생성
		//앞으로객체생성을 하지 않고 st인스턴스를 빌려서 사용하게 만듦
		private static SingletonTest instance  = new SingletonTest();
		String name = "";
		int score;
		
		//1.생성자를 private로 선언하여 외부에서 객체생성불가!
		
		private SingletonTest() {}
		
		//3.생성된 instance를 return으로 빌려서 사용할수 있게
		//static 메서드생성
	    public static SingletonTest getInstance() {
	    		if(instance == null) {
	    			instance = new SingletonTest();
	    			
	    		}
	    		return instance;
	    }
		
	
}//class
