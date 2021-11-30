public class MathFunctions {
    public static int multiplyNumber(int numberA, int numberB) {
        return numberA * numberB;
    }
    public static String concatenate(String strA, String strB){
        return strA.concat(strB);
    }
    public static int potInt(int a, int b){
	    if(b == 0){
			return 1;
		}
		if(b == 1){
			return a;
		}
		return a * potInt(a,b-1);
	}
}
