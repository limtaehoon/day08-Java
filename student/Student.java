package Allay;

import java.util.ArrayList;





public class Student {
	int studentID;
	String studentName;
	Subject[] subjectList;
	int index;
	public Student(int studentID,String stdentName) {
		this.studentID=studentID;
		this.studentName=stdentName;
		subjectList=new Subject[10];
	
	subjectList=new Subject[10];
	}
	public void addSubject(String name,int score) {
		Subject subject=new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		//subjectList.add(subject);
		subjectList[index++]=subject;
	}
	public void showStudentInfo() {
		int total=0;
		for (Subject s:subjectList) {
			if(s==null)break;
			total+=s.getScorePoint();
			System.out.print("�л�"+studentName+"��"+s.getName()+"���� ������ "
					+s.getScorePoint()+"�Դϴ�");
			
		}
		System.out.println("�л���"+studentName+"������"+total+"�Դϴ�");
	}
	
}
