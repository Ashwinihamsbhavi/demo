package Abstract1;

import java.util.ArrayList;

class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l2 = new ArrayList();
		l2.add(10);
		l2.add("hey");
		l2.add("s");
		l2.add(14.3);
		l2.add(2,"hi");
		l2.add(true);
		l2.add(3,"hi");
		ArrayList l3 = new ArrayList();
l3.add(44);
		
		l3.add("ashu");
		l3.add("vinu");
		l3.add("laxmi");
		System.out.println("before add all");
		System.out.println("l2"+l2);
		System.out.println("l3"+l3);
		l2.addAll(l3);
		System.out.println("l2"+l2);
		System.out.println("l3"+l3);
		l2.addAll(1,l2);
		System.out.println("after add all");
		System.out.println("l2"+l2);
		System.out.println("l3"+l3);
		
		
		
		
		
	}

}
