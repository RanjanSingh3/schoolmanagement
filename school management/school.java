import java.util.List;

import javax.management.loading.PrivateClassLoader;

public class school {
    
    private List<student>students;
    private List<teacher>teachers;
    private int totalmoneyEarn;
    private int totalmoneyspands;
    


    public school(List<student>students,List<teacher>teachers){
        this.teachers=teachers;
        this.students=students;
        totalmoneyEarn=0;
        totalmoneyspands=0;

    }
    public List<teacher> getteachers(){
        return teachers;

    }
    public void addteacher(teacher teacher){
        teachers.add(teacher);
        

      
    }
    public List<student> getstudents(){
        return students;
    }
    public void addstudent(student student){
        students.add(student);
    }
    public int totalmoneyEarn(){
        return totalmoneyEarn;
    }
    public void updatetotalmoneyEarn(int  moneyEarn){
        totalmoneyEarn+=moneyEarn;
    }
    public int totalmoneyspands(){
        return totalmoneyspands;
    }
    
    public void updatetotalmoneyspands(int moneyspands){
        totalmoneyEarn-=moneyspands;

    }

}
