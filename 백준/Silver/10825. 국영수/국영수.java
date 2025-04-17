import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static class Student {
        String name = "";
        int kor, eng, math;
        public Student() {
            name = "";
            kor = 0;
            eng = 0;
            math = 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student();
            students[i].name = st.nextToken();
            students[i].kor = Integer.parseInt(st.nextToken());
            students[i].eng = Integer.parseInt(st.nextToken());
            students[i].math = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // compare 자체는 앞이 작으면 0을 리턴하는데 이는 오름차순과 동일하다고 볼 수 있음
                // 앞 수가 뒷 수보다 크면 내림차순이니까 반대로 적어주면 됨
                if(s1.kor != s2.kor) return Integer.compare(s2.kor, s1.kor); // 국어 감소(내림차순)
                else if(s1.eng != s2.eng) return Integer.compare(s1.eng, s2.eng); // 영어 증가(오름차순)
                else if(s1.math != s2.math) return Integer.compare(s2.math, s1.math); // 수학 감소(내림차순)
                else return s1.name.compareTo(s2.name);
            }
        });
        for (int i = 0; i < N; i++) {
            sb.append(students[i].name);
            if (i != N-1) sb.append("\n");
        }
        System.out.print(sb);
    }
}