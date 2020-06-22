//Final program for object creation and various ways to access it
class Student6
{
	String name;
	int r_no;
	final static String uni_name="UPES";
	
	
	Student6(String name,int R_no)
	{
		this.name=name;
		this.r_no=r_no;
		
	}
	
	public static void main(String args[])
	{
		Student6 obj=new Student6("abc",20);
		System.out.println(obj.name);
		System.out.println(obj.r_no);
		System.out.println(obj.uni_name);
		Student6 obj1=new Student6("def",19);
		System.out.println(obj1.r_no);
		System.out.println(Student6.uni_name);
		System.out.println(Student6.uni_name);
		System.out.println(obj);
		System.out.println(obj1);
		
		
	}
}