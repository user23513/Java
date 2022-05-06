package co.micol.prj220506.rotto;

import java.util.Arrays;

public class LottoArray {
	
	int[] rottoArr = new int[6];

	public LottoArray() {
		rottoInput();
		
	}
	
	private void rottoInput() {
		//중복되는 숫자 없게
		for(int i = 0 ; i<rottoArr.length; i++) {
			int random = (int)((Math.random()*44)+1);
			rottoArr[i] = random;
			if(i != 0) {
				for(int j = 0; j<i; j++) {
				if(rottoArr[i] == rottoArr[j])
					i--;
			}
				
			}
			
		}
		
		
		Arrays.sort(rottoArr);
		for(int a : rottoArr) {
			System.out.print(a + " ");
		}
		
	}
	
	
}

