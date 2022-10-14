import java.util.Scanner;

class Person{

	static int tempid=0;
	int id;
	String name;
	Person(int x,String n){
		tempid++;
		id=tempid;
		name=n;
	}

	void display(){
		System.out.println("id "+id);
	
		System.out.println("Name:"+name);
	}
}

public class Assign01{

	public static void main(String [] args){
		int choice;
		Person arr[]=new Person[5];
		Scanner obj=new Scanner(System.in);
		
		int i=0;
		boolean a=true;
		while (a){
			System.out.println("1. create 2. Display 3. Exit");
			choice=obj.nextInt();
			switch(choice){
				case 1:{
						
					arr[i]=new Person(i,"NA");
					i++;
					//id++;
					break;
				}
				case 2:{
					for (int j=0;j<i;j++){
						arr[j].display();
					}
					break;
				}
				case 3:{
					a=false;
					break;	
				}
			}
		}
					
	}
}