package JavaLearning.Practice.Extend;

public class Assistant extends Employee {

    public Assistant(String assistantName, int id, int age, String workType) {

        //继承父类的成员变量
        super(assistantName, id, age, workType);
    }
    public Assistant() {

    }
}
