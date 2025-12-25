//  이진 검색 트리

import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> pre = new ArrayList<>();
    private static class Node {
        int key;
        Node lnode, rnode;

        Node(int key) {
            this.key = key;
            lnode = rnode = null;
        }
    }
    private static Node build(int start, int end) {
        if (start > end) return null;
        Node root = new Node(pre.get(start));
        int idx = start + 1;
        while (idx <= end && pre.get(idx) < root.key) idx++;
        root.lnode = build(start + 1, idx - 1);
        root.rnode = build(idx, end);
        return root;
    }
    private static void postorder(Node node) {
        if (node.lnode != null) postorder(node.lnode);
        if (node.rnode != null) postorder(node.rnode);
        System.out.println(node.key);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String next = br.readLine();
            if (next == null) break;
            else pre.add(Integer.parseInt(next));
        }
        Node tree = build(0, pre.size() - 1);
        postorder(tree);
    }
}