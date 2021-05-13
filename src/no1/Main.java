package no1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Student st1 = new Student("손오공","1682");
        Student st2 = new Student("저팔계","1683");
        Student st3 = new Student("사오정","1684");

        ArrayList <Student>list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for(Student stu : list){
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("계속 검색을 하고 싶으시면 y, 종료하고싶으면 n");
            String input = scan.next();

            if (input.equals("y")){
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                boolean flag = false;

                for (Student stu : list){
                    if(stu.getName().equals(name)){
                        System.out.println(stu.getNo());
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("없는 이름 입니다.");
                }
            }

            else if(input.equals("n")){
                break; //탈출
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
};