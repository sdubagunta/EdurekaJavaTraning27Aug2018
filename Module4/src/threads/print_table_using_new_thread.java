package threads;

class table extends Thread{
	public synchronized void run(){
		for (int i = 0; i <= 10; i++) {
			int a = 10;
			System.out.println(a + "x" + i + " = " + a * i);
		}
	}
}

public class print_table_using_new_thread {

	public static void main(String[] args) {
		
		table newobj = new table();
		newobj.start();		
		System.out.println("-------------Main Started--------------");
		System.out.println("Printing even numbers...");
		for (int i = 0; i<=40; i+=2){
			System.out.println(i);
		}
	
		System.out.println("------------Main Finished-------------");
	}
}


