package adapter;
//Adapter
public class AdapterEx {
	public static void main(String[] args) {
		Student student = new HumanAdapter("김기태", 39);
		student.showName();
		student.showAge();
	}
}