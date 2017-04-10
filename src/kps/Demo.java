package kps;

public class Demo {

	public static void main(String[] args) {
		
		Person p =new Person();
		
		try{
			p.setAge(19);
			p.setA(new int[4]);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("outside try block");
	}
	
	
}
