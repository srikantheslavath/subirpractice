package Def;


public  class Multi implements Runnable{

public void run() {
	System.out.println("Srivastava");
}
public static void main(String[] args) {
	Runnable r1 = new Multi();
	Thread t = new Thread(r1,"Sri");
	t.start();
	String s = t.getName();
	System.out.println(s);
}
	
	
	}

	 
	 



