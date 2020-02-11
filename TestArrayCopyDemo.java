

public class TestArrayCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyForm = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char[] copyTo = new char[7];
		System.arraycopy(copyForm,2,copyTo,0,7);
		System.out.println(new String(copyTo));

	}

}
