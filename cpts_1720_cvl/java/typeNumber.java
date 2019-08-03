package typeNumber;

public class typeNumber {
	public static int number(int a)
	{
		return a;
	}
	//user cannot type a very big number or very small number
	//for example if number is -110000 or 100000, it is 
	//very big or small number, so it return 0
	public static int range(int a)
	{
		if(a>-10000 && a<10000) {
			return a;
		}else {
			return 0;
		}
		
	}


}
