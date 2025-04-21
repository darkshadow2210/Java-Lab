class student1 {
	int rollno;
	String name, branch;

	void display() {
		System.out.println("SUPER CLASS DISPLAY");
		System.out.println("HELLO");
	}
}

class studentdemo extends student1 {
	void display() {
		System.out.println("SUB CLASS DISPLAY");
		System.out.println("WELCOME");
	}
}

class St1 {
	public static void main(String a[]) {
		student1 s;
		student1 s1 = new student1();
		studentdemo s2 = new studentdemo();
		s = s1;
		s.display();
		s = s2;
		s.display();
	}
}
