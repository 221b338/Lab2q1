/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int x=Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++){
		    System.out.println(x+"x"+i+"="+x*i);
		}
	}
}
*/

public class Main
{
    String name;
    int age;
	void setAge(int age){
	    this.age=age;
	}
	void setName(String name){
	    this.name=name;
	}
	int getAge(){
	    return this.age;
	}
	String getName(){
	    return this.name;
	}
	public static void main(String[] args) {
	    Main m1=new Main();
	    m1.setName("Bhupendra Kumar");
	    m1.setAge(21);
	    System.out.println(m1.getName()+" "+m1.getAge());
	}
}
