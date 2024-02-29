class Student{
	String name = "Student1";
	int sub1 = 85;
	int sub2 = 80;
	int sub3 = 75;
	
	int sum(){
		return sub1+sub2+sub3;
	}
	int total = sum();
	
	int average(){
		return total/3;
	}
	
	public static void main(String[]arngs){
		Student s1 = new Student();
		System.out.println("Name of student :" +s1.name);
		System.out.println("Total Marks :" +s1.total);
		System.out.println("average :" +s1.average());
		
	}
	
}


