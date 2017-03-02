
public class multiple {
	private int num;
	//constructors
	public multiple(){num = 0;}
	public multiple(int a){setNum(a);}

	//mutator
	public void setNum(int x){
		num = x;
		if (num % 3 != 0){
			//num = num - num%3 + 3;
			num++;
			if(num%3!=0)
				num++;
		}
	}

	//Acessor 
	public int getNum(){return num;}

	public void increment (){num += 3;}

	public void decrement(){num -= 3;}

	public multiple Add(multiple e){
		return new multiple(num + e.num);}


	//method overloading
	public multiple Add(int a){
		return new multiple (a + num);
	}

	public boolean isEqual(multiple e){
		if(e.num == num){
			return true;}
		return false;
	}
	public void assign(multiple e){
		num = e.num;
	}

	public void print(){
		System.out.println("num : " +num);
	}
}