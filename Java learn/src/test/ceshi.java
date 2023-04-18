package test;

class Student {
    // 类的成员变量
    private String sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;

    // 成员方法
    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public int getsJava() {
        return sJava;
    }

    public void setsJava(int sJava) {
        this.sJava = sJava;
    }

    public Student(String sNo, String sName, String sSex, int sAge, int sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

}

public class ceshi {
        public static void main(String[] args) {
            Student[] students = new Student[5];
            students[0] = new Student("220110", "Tom", "男", 18, 85);
            students[1] = new Student("220111", "Tohm", "男", 18, 82);
            students[2] = new Student("220112", "Tomf", "女", 18, 79);
            students[3] = new Student("220113", "WTom", "男", 18, 85);
            students[4] = new Student("220114", "seTom", "男", 18, 90);
            int sum = 0;
            int average = 0;
            int max = students[0].getsJava();
            int min = students[0].getsJava();
            for (Student student : students) {
                int java = student.getsJava();
                sum += java;
                if (max < java) {
                    max = java;
                }
                if (min > java) {
                    min = java;
                }
            }
            average = sum/(students.length);
            System.out.println("Java语言的平均成绩是:"+average);
            System.out.println("Java语言成绩的最大值是:"+max);
            System.out.println("Java语言成绩的最小值是:"+min);
    }
}
