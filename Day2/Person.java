class Person{

	int age;
	float height;
	float weight;
	
	Person(){
		age = 24;
		height = 5.9f;
		weight = 73.0f;
	}

	Person(int a, float h, float w){
		age = a;
		height = h;
		weight = w;
	}

	int display(){
		System.out.println("Age : "+age+", Height : "+height+", Weight : "+weight);
		return 0;
	}

	public static void main(String arg[]){
		Person p1 = new Person();
		Person p2 = new Person(43,5.5f,65.0f);

		p1.display();
		p2.display();
	}
	
}