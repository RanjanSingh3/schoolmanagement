public class teacher {
    private int id;
    private String name;
    private int salary;

    public teacher(int id, String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }


    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public void  setsalary(int salary){
        this.salary=salary;
    }

    
}
