import java.io.*;
import java.util.*;

public class Main {
    public static class MinHeap {
        private int[] heap;
        public int numItems;

        public MinHeap(int size) {
            heap = new int[size + 1];
            numItems = 0;
        }

        public void insert(int val) {
            heap[++numItems] = val;
            int index = numItems;
            while (index > 1 && heap[index] < heap[index / 2]) {
                swap(index, index/2);
                index /= 2;
            }
        }

        public int delete() {
            if (numItems == 0) return 0;
            int top = heap[1];
            heap[1] = heap[numItems--];
            heapify(1);
            return top;
        }

        private void heapify(int i) {
            int left = i * 2, right  = i * 2 + 1, smallest = i;
            if (left <= numItems && heap[left] < heap[smallest]) smallest = left;
            if (right <= numItems && heap[right] < heap[smallest]) smallest = right;

            if (smallest != i) {
                swap(i, smallest);
                heapify(smallest);
            }
        }

        private void swap(int index1, int index2) {
            int temp = heap[index1];
            heap[index1] = heap[index2];
            heap[index2] = temp;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        MinHeap heap = new MinHeap(N);
        while (N-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) sb.append(heap.delete()).append("\n");
            else heap.insert(temp);
        }
        System.out.print(sb);
    }
}