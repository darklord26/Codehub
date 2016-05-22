package string_manipulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "GOOG,Google,21|MSFT,microsoft,25|ACT,acti,21";
		countHoldings(s);

	}
	
	static int countHoldings(String input) {
	       String var = "|";
			int sum =0;
	       String [] holdings = input.split("\\"+var);
	       for(String i : holdings){
	           String [] str = i.split(",");
	           sum+=Integer.parseInt(str[2]);
	           
	       }
	       return sum;
	    }

}
