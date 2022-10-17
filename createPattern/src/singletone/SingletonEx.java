package singletone;
//싱글톤 하나의 객체만을 요구하는 싱글 쓰레드 시스템이나 자원을 공유하는 분야에서 활용
public class SingletonEx {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
	}
}