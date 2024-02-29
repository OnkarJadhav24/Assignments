class Box{
	float height;
	float breadth;
	float width;
	
	Box(float h, float w, float b){
		height = h;
		width = w;
		breadth = b;
	}
	float volume(){
		return height*breadth*width;
	}
	
	float area(){
		return breadth*width;
	}
	
	public static void main(String[]arngs){
		Box b1 = new Box (10.5f, 12.1f, 6.4f);
		Box b2 = new Box (9.2f, 10.5f, 11.4f);
		
		System.out.println("volume of box1 :" +b1.volume());
		System.out.println("volume of box1 :" +b2.area());
		System.out.println("volume of box2 :" +b1.volume());
		System.out.println("volume of box2 :" +b2.area());
		
	}
	
}


