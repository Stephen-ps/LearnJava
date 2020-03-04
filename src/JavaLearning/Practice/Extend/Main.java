package JavaLearning.Practice.Extend;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //这部分为测试继承关系。
        //测试了一下子类可以自己定义变量名称,并且子类不能直接get父类的变量
        ArrayList<Object> employeeDataList = new ArrayList<>();
        /*Employee employee = new Employee("12312",1,12,"Math");
        System.out.println(employee.getAge());*/
        Employee employee = new Employee();
        employee.setAge(123213);
        System.out.println("==============================================================");

        Teacher teacher = new Teacher();
        Assistant assistant = new Assistant();
        assistant.setAge(520);
        System.out.println("==============================================================");
        teacher.setAge(1000);
        System.out.println("==============================================================");
        System.out.println("Teacher 的年龄是：" + teacher.getAge());
        System.out.println("==============================================================");
        System.out.println("Assistant 的年龄是：" + teacher.getAge());
        /*teacher.setName(employee.getName());*///不注释这段代码，输出结果为子类变量
        /*Teacher teacher1 = new Teacher();*/


        /*for (int i = 0; i <= 1000; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入教师的姓名：");
            String teacherName = scanner.next();
            employee.setName(teacherName);
            employeeDataList.add(employee.getName());
            System.out.println(employeeDataList);

            System.out.println("请输入教师的年龄：");
            int teacherAge = scanner.nextInt();
            teacher.setAge(teacherAge);
            employeeDataList.add(teacher.getAge());
            System.out.println(employeeDataList);

            System.out.println("请输入教师的工作：");
            String teacherWorkType = scanner.next();
            teacher.setWorkType(teacherWorkType);
            employeeDataList.add(teacher.getWorkType());
            System.out.println(employeeDataList);

            System.out.println("Do you want to input more data(Y/N)");
            String exit = scanner.next();
            if (exit.equals("y")) {
                break;
            }
        }*/


        /*Employee employee = new Employee("asd",123,123,"asd");
        System.out.println(employee.getAge());*/
    }
}
