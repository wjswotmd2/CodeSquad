package Self01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("학생 이름, 학과 , 학번 ,평균점수를 입력하세요 ");

        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            String str = scan.nextLine();
            StringTokenizer st = new StringTokenizer(str, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String no = st.nextToken().trim();
            String score = st.nextToken().trim();
            students.add(new Student(name, department, no, score));
        }

        for(int i = 0; i < 4; i++) {
            System.out.println("-------------------------------");
            students.get(i).show();
        }

        System.out.println("--------------------------------");


        while (true) {
            System.out.print("학생이름 >>");
            String name = scan.next();
            if(name.equals("그만")) {
                break;
            }

            for(int i = 0; i < 4; i++) {
                if(students.get(i).name.equals(name)){
                    students.get(i).find();
                    break;
                }
            }
        }
        scan.close();
    }
}
