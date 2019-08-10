package ntu.basic.java;

public class StudentDemo {

	public static void main(String[] args) {
		HighSchoolStudent h = new HighSchoolStudent();
		goStudy(h);
		
		CollegeStudent c = new CollegeStudent();
		goStudy(c);
		
		GradSchoolStudent g = new GradSchoolStudent();
		goStudy(g);
	}
	
//	public void goStudy(HighSchoolStudent h){
//		h.doHomework();
//	}
//	
//	public void goStudy(CollegeStudent c){
//		c.writeReports();
//	}
	
	public static void goStudy(Student s){
		s.doMyJob();
	}
}

class Student {
	void doMyJob(){/* unknow detail*/}
}

class HighSchoolStudent extends Student {
	void doHomework() {
	};
	
	@Override
	void doMyJob(){
		doHomework();
	}
}

class CollegeStudent extends Student {
	void writeReports() {
	};
	
	@Override
	void doMyJob(){
		writeReports();
	}
}

class GradSchoolStudent extends Student {
	void writeThesis(){};
	
	@Override
	void doMyJob(){
		writeThesis();
	}
}
