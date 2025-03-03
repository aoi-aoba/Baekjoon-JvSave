import java.io.*;
import java.util.*;

public class Main {
    static class Nation implements Comparable<Nation> {
        private int name, gold, silver, bronze, rank;
        public Nation(int name, int gold, int silver, int bronze) {
            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 1;
        } // constructor

        @Override
        public int compareTo(Nation o) {
            if(this.gold == o.gold) {
                if(this.silver == o.silver) {
                    return o.bronze - this.bronze;
                } else {
                    return o.silver - this.silver;
                }
            } else {
                return o.gold - this.gold;
            }
        } // compareTo
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Nation> medalList = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            int name = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            Nation nation = new Nation(name, gold, silver, bronze);
            medalList.add(nation);
        }

        Collections.sort(medalList);
        // override 규칙에 의해 compareTo가 적용된 상태로 sort가 진행됨

        for(int i=1; i<n; i++) {
            Nation prev = medalList.get(i-1);
            Nation now = medalList.get(i);
            if(prev.gold == now.gold && prev.silver == now.silver && prev.bronze == now.bronze)
                now.rank = prev.rank;
            // 초기 순위(rank)는 1로 constructor 의해 init 되어있으므로 같으면 그냥 쭉쭉 진행하면서 복사해주면 됨
            else now.rank = i+1;
            // 아니게 된다면 그제서야 rank를 1 올려주면 되는데, 이때 i+1인 것은 "앞에 있는 나보다 잘한 국가" + 1(위)로 결정하기 때문임
        }

        // Stream<T> filter(Predicate<? super T> predicate), predicate는 조건 판별 함수형 인터페이스
        medalList.stream().
                filter(nation -> nation.name == k)
                .map(nation -> nation.rank)
                .forEach(System.out::println);
        br.close();
    }
}