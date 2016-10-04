package 운영체제과제1;

public class test_driver {

	public static void main(String[] args) {
		sorting_thread Sorting_Thread0=new sorting_thread();
		sorting_thread Sorting_Thread1=new sorting_thread();
		
		Sorting_Thread0.run();
		Sorting_Thread1.run();

	}

}
