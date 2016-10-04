package 운영체제과제1;

public class merge_thread implements Runnable{
	private int[] sorted_string1;
	private int[] sorted_string2;
	
	public merge_thread(int[] sorted_string1, int[] sorted_string2) {
		super();
		this.sorted_string1 = sorted_string1;
		this.sorted_string2 = sorted_string2;
	}

	@Override
	public void run() {
		int i,j;
		for(i=0,j=0;i<sorted_string1.length || j<sorted_string2.length;){
			if(sorted_string1[i]<sorted_string2[j]){
				
			}
		}
	}
	
}
