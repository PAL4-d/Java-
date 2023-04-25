package test;

class Student1{
	private int sNO; 
	private String sName;
	private String sSex;
	private int sAge;
	private double sJava;
	public Student1(int sNO,String sName,String sSex,int sAge,double sJava){ //�вι��췽��
		this.sNO=sNO;
		this.sName=sName;
		this.sSex=sSex;
		this.sAge=sAge;
		this.sJava=sJava;
	}
	public int getNo(){ 
		return sNO;
	}
	public String getName(){
		return sName;
	}
	public String getSex(){
		return sSex;
	}
	public int getAge(){
		return sAge;
	}
	public double getJava(){
		return sJava;
	}
	public void info(){
		System.out.println("学号:" + sNO + "  姓名:" + sName + "  性别：" + sSex + "  年龄:" + sAge + "  java成绩:" + sJava);
	}
}


public class wangfeng {

	public static void main(String[] args) {
		Student1 Stu1 = new Student1(1, "wf", "男", 18, 86);
		Student1 Stu2 = new Student1(2, "wf1", "男", 19, 94);
		Student1 Stu3 = new Student1(3, "wf2", "男", 20, 99);
		Stu1.info();
		Stu2.info();
		Stu3.info();
		double [] java = new double[3];
		java[0] = Stu1.getJava();
		java[1] = Stu2.getJava();
		java[2] = Stu3.getJava();
		double avejava = ((java[0]+java[1]+java[2])/java.length);
		System.out.println("平均成绩为" + avejava);
		double max = java[0];
		double min = java[0];
		for(int i = 1;i<java.length;i++){
			if(java[i]>max){
				max = java[i];
			}
		}
		System.out.println("成绩最高分是：" + max);
		for(int i = 1;i<java.length;i++){
			if(java[i]<min){
				min = java[i];
			}
		}
		System.out.println("成绩最低分是:" + min);
	}

}
