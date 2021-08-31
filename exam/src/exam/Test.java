package exam;

public class Test {

	public static void main(String[] args) {
		
	Unit marine = new Marine();
	Unit tank = new Tank();
	Unit dropship = new Dropship();
	
		marine.move(0, 0);
		tank.move(0, 0);
		dropship.move(0, 0);
		
		
/*		
	Unit marine = new Marine();
	Unit tank = new Tank();
	Unit dropship; // = new Dropship();
	
		marine.move(0, 0);
		tank.move(0, 0);
		dropship.move(0, 0);	스택의 생명주기 때문에 생기는 문제	
		
*/ 
	}		
}
