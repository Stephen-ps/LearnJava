package JavaLearning.Practice.Extend;

public class Employee {

    private String name;
    private int id;
    private int age;
    private String workType;

    public Employee(String name, int id, int age, String workType) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.workType = workType;
        System.out.println("父类构造器使用");
    }
    public Employee() {

    }


    public String getName() {

        return name;
    }
    public int getId() {

        return id;
    }
    public int getAge() {

        return age;
    }
    public String getWorkType() {

        return workType;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setId(int id) {

        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("==========Employee构造器使用===========");
        if (age > 100){
            System.out.println("=========Employee类setAge类错误============");
        }
    }
    public void setWorkType(String workType) {

        this.workType = workType;
    }
}
