package constructor;

public class Constructoroverloading {
	int id;
	String name;
	int age;
	//creating two arg constructor  
	void Student5(int i,String n){
		id = i;
		name = n;
		}
	//creating three arg constructor  
	void Student5(int i,String n,int a){
		id = i;
		name = n;
		age=a;
		}
	void
	display(){
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[]){
		Constructoroverloading s1 = new Constructoroverloading();
		s1.Student5(4, "naveen", 24);
		s1.display();
		}
	}

	
