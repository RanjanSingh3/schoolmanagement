public class  student{
    private  String name;
    private int id;
    private int feespaid;
    private int totalfees;
    private int gread;

    public  student(int id, String name, int gread){
        this.id=id;
        this.name=name;
        this.gread=gread;
        this.feespaid=0;
        this.totalfees=30000;
    }


    public void setgread(int gread){//using for undate the student's gread

    this.gread=gread;
    }
    public void payfees(int fees){
        //feespaid=feespaid+fees;
        feespaid+=fees;
    }
    public String getname(String name){
        return name;
    }
    public int getid(int id){
        return id;

    }
    public int  detgread(int gread){
        return gread;
    }
    public int getfeespaid(int feespaid){
        return feespaid;
    }
    public int gettotalfees(int totalfees){
        return totalfees;
    }
    public int getraimingfees(){
        return totalfees-=feespaid;
    }
}