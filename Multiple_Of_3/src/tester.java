
public class tester {
	public static void main(String [] args){
		multiple A1 = new multiple();
		multiple A2 = new multiple(5);
		A1.setNum(2);
		A1.print();
		A2.print();
		A1.decrement();
		A1.decrement();
		A2.increment();
		A1.print();
		A2.print();
		multiple A3 = A1.Add(A2);
		A3.print();
		A1 = A1.Add(9);
		A1.print();
	}

}
