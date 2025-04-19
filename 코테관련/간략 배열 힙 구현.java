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
            // 부모의 위치와 비교하여 부모보다 작으면 계속 swap하며 올라가기
            while (index > 1 && heap[index] < heap[index / 2]) {
                swap(index, index/2);
                index /= 2; // 루트 노드에 도달할 때까지 혹은 while 벗어날 때까지
            }
        }

        public int delete() {
            if (numItems == 0) return 0;
            int top = heap[1]; // 현재 루트 값을 뽑아내고
            heap[1] = heap[numItems--]; // 마지막 값을 루트로 올리고
            heapify(1); // 아닌 건 모두 재배열
            return top; // 뽑아낸 루트 값은 출력
        }

        private void heapify(int i) {
            int left = i * 2, right  = i * 2 + 1, smallest = i;
            // 왼쪽, 오른쪽 자식과 최소값

            if (left <= numItems && heap[left] < heap[smallest]) smallest = left;
            if (right <= numItems && heap[right] < heap[smallest]) smallest = right;
            // 부분 트리의 최소값을 왼쪽/오른쪽에 대해 비교하여 찾아냄

            if (smallest != i) { // 만약 부분 트리의 루트 노드가 제일 작지 않다면
                swap(i, smallest); // 루트 노드와 위치를 변경
                heapify(smallest); // 기존의 루트 노드가 이동한 자리에 대해 다시 heapify 재귀호출
            }
        }

        private void swap(int index1, int index2) {
            int temp = heap[index1];
            heap[index1] = heap[index2];
            heap[index2] = temp;
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 문제를 풀이
    }
}
