import java.io.*;
import java.util.*;

public class Main {
    public static class Student {
        String name;
        int year, month, day;
        public Student(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken()), month = Integer.parseInt(st.nextToken()), year = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, year, month, day);
        }
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.year != s2.year) return Integer.compare(s1.year, s2.year);
                else if (s1.month != s2.month) return Integer.compare(s1.month, s2.month);
                else return Integer.compare(s1.day, s2.day);
            }
        });
        System.out.println(students[students.length-1].name);
        System.out.println(students[0].name);
        br.close();
    }
}