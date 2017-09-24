/**
 * Created by liangjiahao on 24/09/2017.
 */
import java.util.*;
import java.io.PrintStream;
class Student{
    private String name;
    private String num;


    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
class Course{
    private String name;
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Course(String name, String num) {

        this.name = name;
        this.num = num;
    }
}
class Grade{
    private String StudentNum;
    private String CourseNum;
    private double Score;

    public Grade(String studentNum, String courseNum, double score) {
        StudentNum = studentNum;
        CourseNum = courseNum;
        Score = score;
    }

    public String getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(String studentNum) {
        StudentNum = studentNum;
    }

    public String getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(String courseNum) {
        CourseNum = courseNum;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
public class studentSystem {
    public static String search(String stuNum, String courNum, List<Student> stu, List<Course> cour){
         String stuName="";
         String courName="";
        for (int i=0; i<stu.size();i++)
            if(stu.get(i).getNum().equals(stuNum) )
                stuName = stu.get(i).getName();
        for (int j=0; j<cour.size();j++)
            if(cour.get(j).getNum().equals(courNum))
                courName = cour.get(j).getName();
        return courName;
//        if(stuName !=""&&courName !="")
//            System.out.println("学生："+stuName+" 课程: "+courName);
//        else
//            System.out.println("数据不存在");
    }
    public static void allPring(List<Student> stu, List<Course> cour, List<Grade>gra){
        String COURNAME="";

        for (int i=0; i<stu.size();i++){
            for (int j=0; j<gra.size();j++){
                if(stu.get(i).getNum().equals(gra.get(j).getStudentNum())){
                     COURNAME= search(stu.get(i).getNum(),gra.get(j).getCourseNum(),stu,cour);
                    System.out.println("学生："+stu.get(i).getName()+"\t课程："+COURNAME+"\t分数："+gra.get(j).getScore());}

            }
            System.out.println("--------------------------------------");
        }

    }

    public static void getSum(List<Course> cour, List<Grade>gra, int[]a, double[] b){
        int[] stuNumber = new int[cour.size()];
        double[] sums = new double[cour.size()];

        for (int i=0;i<cour.size(); i++){
            for (int j=0; j<gra.size(); j++){
                if (cour.get(i).getNum().equals(gra.get(j).getCourseNum())){
                    stuNumber[i]++;
                    sums[i] += gra.get(j).getScore();
                }
            }
        }
        for(int i=0; i<stuNumber.length;i++){
            a[i]=stuNumber[i];
            b[i]=sums[i];
        }


    }
    public static void printAverage(TreeMap<String,Double> t, List<Course>cour){
        for (int i=0; i<cour.size(); i++){
//            System.out.println(cour.get(i).getName()+"平均分："+t.get(cour.get(i).getNum()));
            System.out.printf("%s平均分：%.2f%n",cour.get(i).getName(),t.get(cour.get(i).getNum()));

        }
    }
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student("奈叶","T00"));
        stu.add(new Student("菲特","T01"));
        stu.add(new Student("疾风","T02"));

        List<Course> cour = new ArrayList<>();
        cour.add(new Course("离散数学","C01"));
        cour.add(new Course("数据结构","C02"));
        cour.add(new Course("操作系统","C03"));

        List<Grade> gra =new ArrayList<>();
        gra.add(new Grade("T00","C01",80));
        gra.add(new Grade("T00","C02",90));
        gra.add(new Grade("T00","C03",100));

        gra.add(new Grade("T01","C01",75));
        gra.add(new Grade("T01","C02",90));
        gra.add(new Grade("T01","C03",95));

        gra.add(new Grade("T02","C01",80));
        gra.add(new Grade("T02","C02",95));
        gra.add(new Grade("T02","C03",95));

//        System.out.println("现在开始查找一名学生和她的课程");
//        System.out.println("请依次输入学生编号和课程编号：");
//        String STU, COUR;
//
//        Scanner imput = new Scanner(System.in);
//        STU = imput.nextLine();
//        COUR = imput.nextLine();
//
        allPring(stu,cour,gra);
        int[] courNumber = new int[cour.size()];
        double[] courSums = new double[cour.size()];

        getSum(cour,gra,courNumber,courSums);
//        for(int i=0; i<courSums.length;i++)
//            System.out.println( courNumber[i]+" "+courSums[i]);
        double ave;
        TreeMap <String,Double> t = new TreeMap<>();
        for (int i=0; i<courNumber.length;i++){
            if (courSums[i]>0){
                ave = courSums[i] / courNumber.length;
                t.put(cour.get(i).getNum(),ave);
            }
        }
        printAverage(t,cour);


    }
}
