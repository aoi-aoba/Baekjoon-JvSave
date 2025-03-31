import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 과목 수
		int subjectCount = Integer.parseInt(br.readLine());
		// 평균 평점
		double averageGrade = calculateAverageGrade(br, subjectCount);

		// 반올림하여 둘째 자리까지 출력
		System.out.printf("%.2f", averageGrade);
	}
	
	// 평균 평점 구하는 메서드
	private static double calculateAverageGrade(BufferedReader br, int subjectCount) throws IOException {
		// 총 학점
		int totalCredit = 0;
		// 평균 평점
		double averageGrade = 0;
		
		for(int i = 0; i < subjectCount; i++) {
			String[] subject = br.readLine().split(" ");
			// 학점
			int credit = Integer.parseInt(subject[1]);
			// 성적
			double gradeSum = calculateGrade(subject[2]);
			// 각 과목의 학점 * 성적을 모두 더하기
			averageGrade += credit * gradeSum;
			// 총 학점 구하기
			totalCredit += credit;
		}
		
		// 평균 평점 반환
		return averageGrade / totalCredit;
	}
	
	// 성적을 구하는 메서드
	private static double calculateGrade(String grade) {
		// F는 0점
		if(grade.equals("F")) return 0;
		
		// 성적 알파벳
		char gradeChar = grade.charAt(0);
		// 점수
		double gradeSum = 0;
		
		switch (gradeChar) {
		case 'A' :
			gradeSum = 4;
			break;
		case 'B' :
			gradeSum = 3;
			break;
		case 'C' :
			gradeSum = 2;
			break;
		case 'D' :
			gradeSum = 1;
			break;
		}
		
		// 성적 수식어
		char gradeModifier = grade.charAt(1);
		if(gradeModifier == '+') gradeSum += 0.3;
		else if(gradeModifier == '-') gradeSum -= 0.3;
		
		// 점수 반환
		return gradeSum;
	}
}