package Elementos;

public class Strings implements Comparadores{
	private String str;
	public String getString() {
		return str;
	}

	public void setString(String str) {
		this.str = str;
	}

	@Override
	public boolean mayorQue(Object x){
		int str1 = 0, str2 = 0;
		for (int y= 0; y<this.str.length();y++)
			str1 = str1+this.str.charAt(y);
		for (int y= 0; y<((String)((Strings)  x).getString()).length();y++)
			str2 = str2+((String)((Strings)  x).getString()).charAt(y);
		boolean result = str1 > str2;
		return result;
	}
	@Override
	public boolean menorQue(Object x){
		int str1 = 0, str2 = 0;
		for (int y= 0; y<this.str.length();y++)
			str1 = str1+this.str.charAt(y);
		for (int y= 0; y<((String)((Strings)  x).getString()).length();y++)
			str2 = str2+((String)((Strings)  x).getString()).charAt(y);
		boolean result = str1 < str2;
		return result;
	}
	@Override
	public boolean mayorIgualQ(Object x){
		int str1 = 0, str2 = 0;
		for (int y= 0; y<this.str.length();y++)
			str1 = str1+this.str.charAt(y);
		for (int y= 0; y<((String)((Strings)  x).getString()).length();y++)
			str2 = str2+((String)((Strings)  x).getString()).charAt(y);
		boolean result = str1 >= str2;
		return result;
	}
	@Override
	public boolean menorIgualQ(Object x){
		int str1 = 0, str2 = 0;
		for (int y= 0; y<this.str.length();y++)
			str1 = str1+this.str.charAt(y);
		for (int y= 0; y<((String)((Strings)  x).getString()).length();y++)
			str2 = str2+((String)((Strings)  x).getString()).charAt(y);
		boolean result = str1 <= str2;
		return result;
	}
	@Override
	public boolean igualQue(Object x){
		boolean result = this.str == ((Strings) ((Elemento) x).getDato()).getString();
		return result;
	}
	@Override
	public String toString() {
		return this.str;
	}

	@Override
	public double menos(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}
}
