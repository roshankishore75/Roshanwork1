package classjava;

public class ModifierSample {
	public int a=10 , b=20;
	public void add()
	{
		int result;
		result=a+b;
		System.out.println(result);
	}
	
 public static void main(String[] args)
 {
	 ModifierSample obj= new ModifierSample();
	 obj.add();
	 
 }
}
