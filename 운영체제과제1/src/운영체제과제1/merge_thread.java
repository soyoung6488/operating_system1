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
		int i,j,k;
		int[] merged_number = null;
		for(i=0,j=0,k=0;i<sorted_number1.length || j<sorted_number2.length;k++){
			if(sorted_number1[i]<sorted_number2[j]){
				merged_number[k]=sorted_number1[i];
				i++;
			}
			else{
				merged_number[k]=sorted_number2[j];
				j++;
			}
		}
		if(i==sorted_number1.length){
			for(;j<sorted_number2.length;j++){
				merged_number[k]=sorted_number2[j];
			}
		}
		else{
			for(;i<sorted_number1.length;i++){
				merged_number[k]=sorted_number1[i];
			}
		}
	}
	
}
