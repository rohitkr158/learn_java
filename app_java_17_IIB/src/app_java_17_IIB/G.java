package app_java_17_IIB;

public class G {
	{
		System.out.println("from IIB 2 ");
	}
	G(){
		System.out.println("from constructor");
	}
	{
		System.out.println("from IIB 1");
	}
	public static void main(String[] args) {
		G g1 = new G();
	}
}
