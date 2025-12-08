import java.util.*;
class person{
	int age;
	String name;
	public void readPerson(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name  and age");
		name=s.nextLine();
		age=s.nextInt();
	}
	public void dispPerson(){
		System.out.println("Name: "+ name);
		System.out.println("Age: "+age);
	}
}
class teacher extends person{
	String subj;
	public void readTeacher(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Subject");
		subj=s.nextLine();
	}
	public  void  dispTeacher(){
		System.out.println("Subject: "+subj);
	}
}
class MPT{
	public  static void main(String args[]){
		person p=new person();
		teacher t=new teacher();
		p.readPerson();
		t.readPerson();
		t.readTeacher();
		p.dispPerson();
		t.dispPerson();
		t.dispTeacher();
		}
}
