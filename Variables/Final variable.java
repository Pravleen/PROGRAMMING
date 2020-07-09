//Use of final variable
class Student5
{
	String name;
	int r_no;
	final static String uni_name="UPES";//used when we have to make a variable constant for all the objects
	
	
	Student5(String name,int R_no)
	{
		this.name=name;
		this.R_no=R_no;
		
	}
	
	public static void main(String args[])
	{
		Student5 obj=new Student5("abc",20);
		System.out.println(obj.name);
		System.out.println(obj.R_no);
		System.out.println(obj.uni_name);
		Student5 obj1=new Student5("def",19);
		System.out.println(obj1.R_no);
		System.out.println(obj1.uni_name);
		System.out.println(obj.uni_name);
		System.out.println(obj);
		
	}
}