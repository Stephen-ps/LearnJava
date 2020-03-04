package JavaLearning.Practice.Extend;

//员工的子类
public class Teacher extends Employee {

    /*private String teacherName;
    private int id;
    private int age;
    private String workType;*/

    public Teacher(String teacherName, int id, int age, String workType) {
        //继承父类的成员变量
        super(teacherName, age,id,workType);
    }
    public Teacher() {

    }
    /*public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
        if (age > 100){
            System.out.println("Teacher类setAge类错误");
        }
    }

    public String getTeacherName() {

        return teacherName;
    }
    @Override
    public int getId() {

        return id;
    }
    @Override
    public int getAge() {

        return age;
    }
    @Override
    public String getWorkType() {

        return workType;
    }*/
}

