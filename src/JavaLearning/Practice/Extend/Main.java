package JavaLearning.Practice.Extend;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        //测试了一下子类可以自己定义变量名称
        ArrayList<Object> employeeDataList = new ArrayList<>();
        Employee employee = new Employee();
        Teacher teacher = new Teacher("Wang", 435451, 25, "Math  ");
        Assistant assistant = new Assistant();
        System.out.println(teacher.getName());


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
