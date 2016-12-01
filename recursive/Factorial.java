package recursive;

public class Factorial {
	public static int fact(int a){
		if(a == 0)
			return 1;
		return a* fact(a-1);
					
	}
	public static int pow(int x , int y){
		if(y ==0 )
			return 1;
		return x* pow(x, y-1);
	}
	
}
