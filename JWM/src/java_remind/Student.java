package java_remind;

public class Student {
	// 필드
	private String name;
	private Exam exam;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void info() {
		System.out.println("학생명  : " + name);
		System.out.println(exam.getExamName() + " 성적");
		System.out.println("국어 : " + exam.getKor() + ",영어 : " + exam.getEng() + ",수학 : " + exam.getMat());
		System.out.println("총점 : " + (exam.getKor() + exam.getEng() + exam.getMat()));
		System.out.println("평균 : " + (exam.getKor() + exam.getEng() + exam.getMat())/3.0);
	
	}
	
}
