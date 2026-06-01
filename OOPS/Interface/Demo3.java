package OOPS.Interface;
/*
It is used to achieve multiple inheritance in java 
Interface is declare using interface key 
By default all methods are abstract in interface and bydefault the variables are static and final
We cannot create object of interaface
At a time we can extend more than one interface
class to class => extends
interface to interface => extends
class to interface => implement*/
interface Post{
	void addPhoto() ;
}

interface LinkedIn{
	void searchJob(String jobType);
}
//multiple inheriance
interface Instagram extends Post,LinkedIn{
	void doMarketing();
}

class Test implements Instagram{

	@Override
	public void addPhoto() {
		System.out.println("Photo Loading........");
		
	}

	@Override
	public void searchJob(String jobType) {
		System.out.println("Looking For "+ jobType);
		
	}

	@Override
	public void doMarketing() {
		System.out.println("Post Add");
		
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		Test t=new Test();
		
		t.addPhoto();
		t.searchJob("Developer");
		t.doMarketing();

	}

}
