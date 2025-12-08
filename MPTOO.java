import  java.util.*;
class person{
	String name;
	int age;
	public void read(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number and Age");
		name=s.nextLine();
		age=s.nextInt();
	}
	public void disp(){
		System.out.println("Name: "+ name);
		System.out.println("Age: "+age);
	}
}
class   teacher{
	String subj;
		public void read(){
			
