class Room{
	int length = 10;
	int width = 20;
	int breadth = 30;
	
	int volume(){
		return length*width*breadth;
	}
	
	public static void main(String[]arngs){
		Room r = new Room();
		System.out.println("Volume of room is : "+r.volume());
	}
	
}


