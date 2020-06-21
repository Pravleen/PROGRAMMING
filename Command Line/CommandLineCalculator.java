//Calculator using CommandLine
class CommandLineCalculator
{
	public static void main(String args[])
	{
		int x= Integer.parseInt(args[0]);
		String o=args[1];
		int y= Integer.parseInt(args[2]);
		int z;
		 if(o.equals("+"))
		 {
			 z=x+y;
			 
		 }
		 else if(o.equals("-"))
		 {
			 z=x-y;
			 
		 }
		 else if(o.equals("*"))
		 {
			 z=x*y;
			 
		 }
		 else if(o.equals("/"))
		 {
			 z=x/y;
			 
		 }
		 else{
			 throw new java.lang.Error("Operator not found");
			 
			 
	}
	System.out.println(z);
}
}