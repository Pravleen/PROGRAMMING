//Creating object and use of this variable
class Student2
{
	Student2(String name,int R_no,String uni_name)
	{
		this.name=name;//use to access the current istance of the object
		this.R_no=R_no;
		this.uni_name=uni_name;
	}
	String name;
	int R_no;
	String uni_name;
	public static void main(String args[])
	{
		Student2 obj=new Student2("abc",20,"UPES");
		System.out.println(obj.name);
		System.out.println(obj.R_no);
		System.out.println(obj.uni_name);
		
		
		
	}
}