package java_code;

public class BasicClass {
	//Instance variable
	String var1;
	int cost = 0;
	public BasicClass(String name_,int cost) {//constructor
		var1 = name_;
		this.cost = cost;//pass the instance of object
		System.out.println("its working");
	}
	// basic function 
	int add(int a ,int b) {
		if(a>b) {
			int larger = a;// its local cant access out side if
		}
		else {
			int larger = b;
		}
		return a+b;
	}
	public static void main(String []args) {
		BasicClass my_class = new BasicClass("sss",12);
	}
}
