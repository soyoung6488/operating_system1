package 운영체제과제1;

public class test_driver {

	public static void main(String[] args) {
		
		getData();
		private sorting_thread Sorting_Thread0=new sorting_thread(///반쪽배열);
		private sorting_thread Sorting_Thread1=new sorting_thread(////반쪽배열);
		private merher_thread Merge_Thread=new merge_thread(//sorting된 두 배열 );
		Sorting_Thread0.run();
		Sorting_Thread1.run();

	}
	
	public static int[] getData(){
		// input file로 부터 STring을 읽어서 int 배열로 바꾸는 메소드 
	}

}
