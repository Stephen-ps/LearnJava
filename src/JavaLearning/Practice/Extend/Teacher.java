package JavaLearning.Practice.Extend;

/**
 * The type Teacher.
 *
 * @Author: Steven
 * @Date: 2020 -03-06 17:01:01.
 */
//员工的子类
public class Teacher extends Employee {

    private String teacherName;
    private int id;
    private int age;
    private String workType;

    /**
     * Instantiates a new Teacher.
     *
     * @param name     the name.
     * @param id       the id.
     * @param age      the age.
     * @param workType the work type.
     */
    public Teacher(String name, int id, int age, String workType) {
        //继承父类的成员变量
        super(name, age,id,workType);
    }

    /**
     * Instantiates a new Teacher.
     */
    public Teacher() {

    }

    @Override
    public void setWorkType(String workType) {

        this.workType = workType;
    }

    public void setName(String teacherName) {
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

    public String getName() {

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
    }
}

