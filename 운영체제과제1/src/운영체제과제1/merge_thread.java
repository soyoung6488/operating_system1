package 운영체제과제1;

public class merge_thread implements Runnable{
	private int[] sorted_number1;
	private int[] sorted_number2;
	
	public merge_thread(int[] sorted_number1, int[] sorted_number2) {
		super();
		this.sorted_number1 = sorted_number1;
		this.sorted_number2 = sorted_number2;
	}

	@Override
	public void run() {
		int i,j;
		
		for(i=0,j=0;i<sorted_number1.length || j<sorted_number2.length;){
			if(sorted_number1[i]<sorted_number2[j]){
				
			}
		}
	}
	
}
