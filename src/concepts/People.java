package concepts;

public class People implements Comparable {
	String name;
	int id;
	
	public People() {
		
	}
	
	public People(int id , String name){
		id = id;
		name = name;
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
