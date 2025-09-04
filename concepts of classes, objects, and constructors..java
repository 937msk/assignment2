package assigm;

public class onceptsofclassesobjectsandconstructors {
	
	    public static void main(String[] args) {
	        Student st = new Student("jhon doe", 20, "A");
	        System.out.println("Student Information:");
	        System.out.println("Name: " + st.name);
	        System.out.println("Age: " + st.age);
	        System.out.println("Grade: " + st.grade);
	    }
	}

	class Student {
	    String name;
	    int age;
	    String grade;

	    Student(String name, int age, String grade) {
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }
	}

