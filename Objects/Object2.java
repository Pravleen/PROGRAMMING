//Creating different objects 
class Student3
{
	Student3(String name,int R_no,String uni_name)
	{
		this.name=name;
		this.R_no=R_no;
		this.uni_name=uni_name;
	}
	String name;
	int R_no;
	static String uni_name;
	public static void main(String args[])
	{
		Student3 obj=new Student3("abc",20,"UPES");
		System.out.println(obj.name);
		System.out.println(obj.R_no);
		System.out.println(obj.uni_name);
		Student3 obj1=new Student3("abc",20,"UPES");
		obj1.uni_name="DIT";
		System.out.println(obj1.R_no);
		System.out.println(obj1.uni_name);
		System.out.println(obj.uni_name);
		
	}
}