package week3.day2;

public class Desktop implements SoftWare,HardWare{


	

	public int hardWareResource(int a, String b) {
		System.out.println("HardWare resources are:"+b);
		System.out.println("The number of hardware resources"+a);
		return 0;
	}

	public void softWareResources(String s, int b) {
		System.out.println("The software resources are"+s);
		System.out.println("The number od software resurces are:"+b);
		
	}
//here commonResources methos ia present in both interface therefore supporting multilevel inheritance
	public void commonResources() {
		System.out.println("COmmon method for two interfaces");
		
	}
	public static void main(String[] args) {
		Desktop obj =new Desktop();
		obj.hardWareResource(4, "Speakers");
		obj.softWareResources("selenium", 7);
		obj.commonResources();
		

}
}