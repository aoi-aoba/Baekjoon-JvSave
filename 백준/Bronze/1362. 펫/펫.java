import java.io.*;
import java.util.*;

public class Main {
    private static class Pet {
        int normalWeight, realWeight;
        public void feedPet(int food) { 
            if(checkPet() == 2) return;
            realWeight += food;
        }
        public void workOut(int time) { 
            if(checkPet() == 2) return;
            realWeight -= time;
        }
        public int checkPet() {
            if(realWeight > normalWeight/2.0 && realWeight < normalWeight*2) return 0;
            else if(realWeight > 0) return 1;
            else return 2;
        }
    }
    private static Pet makeNewPet(int normalWeight, int realWeight) {
        Pet pet = new Pet();
        pet.realWeight = realWeight;
        pet.normalWeight = normalWeight;
        return pet;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pet pet = null;
        int now = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String forwardStr = st.nextToken();
            int backStr = Integer.parseInt(st.nextToken());
            if(forwardStr.equals("0") && backStr == 0) break;
            else {
                if (forwardStr.equals("F")) {
                    pet.feedPet(backStr);
                } else if (forwardStr.equals("E")) {
                    pet.workOut(backStr);
                } else if (forwardStr.equals("#")) {
                    System.out.print(now + " ");
                    switch (pet.checkPet()) {
                        case 0 -> System.out.println(":-)");
                        case 1 -> System.out.println(":-(");
                        case 2 -> System.out.println("RIP");
                    }
                    pet = null;
                } else {
                    pet = makeNewPet(Integer.parseInt(forwardStr), backStr);
                    now++;
                }
            }
        }
        br.close();
    }
}