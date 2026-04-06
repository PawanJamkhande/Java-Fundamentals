package Training;

class Student1 {
    int sId;
    String name;
    int age;
    String grade;

    public Student1(int sId,String name,int age,String grade){
        super();
        this.sId=sId;
        this.name=name;
        this.age=age;
        this.grade=grade;

    }
    @Override
    public String toString(){
        return "sId="+sId+", name=" +name+", age="+age+", grade="+grade;
    }

}

public class Student1Demo{
    public static void main(String[] args){
        Student1 stud[]= new Student1[3];
        stud[0]=new Student1(101,"sam",20,"A");
        stud[1]=new Student1(102,"ram",20,"B");
        stud[2]=new Student1(103,"sham",20,"A");

        for(Student1 x:stud){
            System.out.println(x);
        }


    }
}