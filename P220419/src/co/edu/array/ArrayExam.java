package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
//
//		int score = 1;
//		int score1 = 2;
//		int score2 = 3;
//		int score3 = 4;
//		int score4 = 5;
//		
//		//int[] ary = new int[5];
//		
//		int[] ary1 = {1,2,3,4,5};
//		System.out.println(ary1.length);
//		int sum = 0;
//		for(int i=0; i<ary1.length; i++) {
//			sum += ary1[i];
//		}
//		System.out.println("총합 : " + sum);

		// 3칸짜리 int 타입 배열
		int[] scores = { 83, 90, 87 };

		// scores 배열 첫번째 데이터
		System.out.println(scores[0]);
		// scores 배열 두번째 데이터
		System.out.println(scores[1]);
		// scores 배열 세번째 데이터
		System.out.println(scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			// sum = sum + scores[i];
		}

		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

		// 최대, 최소값 구하기
		int[] ary2 = { 5, 3, 2, 8, 1 };
		int max = 0;
		int min = ary2[0];
		for (int i = 0; i < ary2.length; i++) {
			// 최대값
			if (max < ary2[i]) {
				max = ary2[i];
			}
			// 최솟값
			if (min > ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);

		// 내림차순 5 -> 4 -> 3 -> 2 -> 1
		// 데이터 비교해서 값 바꾸기

	}

}
