package JavaLearning.Practice.Extend;

//员工的子类
public class Teacher extends Employee {

    public Teacher(String teacherName, int id, int age, String workType) {
        //继承父类的成员变量
        super(teacherName, id, age, workType);
    }
    public Teacher() {

    }
}

