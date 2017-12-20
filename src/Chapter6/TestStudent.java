package Chapter6;

public class TestStudent {
	public static void main(String[] args){
		Student s1 = new Student();

		s1.setName("Hector");

		s1.setScore(1,100);
		s1.setScore(3, 60);

		System.out.println(s1);

		Student s2 = new Student();

		s2.setName("Matt");

		s2.setScore(1,100);
		s2.setScore(3, 80);



	}
}
