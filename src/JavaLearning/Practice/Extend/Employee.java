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
    }
    public Employee() {

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getWorkType() {

        return workType;
    }

    public void setWorkType(String workType) {

        this.workType = workType;
    }
}
