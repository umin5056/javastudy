package java_remind;

public class Exam {
	// 필드
		private String examName;
		private int kor;
		private int eng;
		private int mat;
		
		public Exam(String examName) {
			super();
			this.examName = examName;
		}
		
		public void setScore() {
			kor = (int)(Math.random()*101);
			eng = (int)(Math.random()*101);
			mat = (int)(Math.random()*101);
		}

		public String getExamName() {
			return examName;
		}

		public void setExamName(String examName) {
			this.examName = examName;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMat() {
			return mat;
		}

		public void setMat(int mat) {
			this.mat = mat;
		}
		

}
