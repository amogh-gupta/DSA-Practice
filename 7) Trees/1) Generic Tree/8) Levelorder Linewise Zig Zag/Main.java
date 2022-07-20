// Question URL: https://nados.io/question/levelorder-linewise-zig-zag\
import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static void traversals(Node node){
    System.out.println("Node Pre " + node.data);

    for(Node child: node.children){
      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    System.out.println("Node Post " + node.data);
  }

  public static void levelOrderLinewiseZZ1(Node node){
    // write your code here
    Stack<Node> stack = new Stack<>();
    Stack<Node> helper = new Stack<>();
    stack.push(node);
    while(true){
      while(stack.size() != 0){
        Node tempNode = stack.pop();
        System.out.print(tempNode.data + " ");
        for (Node child : tempNode.children) {
          helper.push(child);
        }
      }
      if(helper.size() == 0){
        break;
      }
      
      stack = helper;
      helper = new Stack<>();
      System.out.println();  
    }
  }

  public static void levelOrderLinewiseZZ(Node node){
    Queue<Node> queue = new ArrayDeque<>();
    Queue<Node> helperQueue = new ArrayDeque<>();
    
    Stack<Node> stack = new Stack<>();
    Stack<Node> helperStack = new Stack<>();
    queue.add(node);
    stack.push(node);
    
    int i = 0;

    while(true){
      if(i%2==0){
        while(queue.size()>0){
          Node tempNodeq = queue.remove();
          System.out.print(tempNodeq.data + " ");

          Node tempNodes = stack.pop();

          for (Node child : tempNodes.children) {
            helperStack.push(child);
            helperQueue.add(child);
          }
        }
        i++;
      }
      else{
        while(stack.size()>0){
          Node tempNodes = stack.pop();
          System.out.print(tempNodes.data + " ");

          Node tempNodeq = queue.remove();

          for (Node child : tempNodeq.children) {
            helperStack.push(child);
            helperQueue.add(child);

          }
        }
        i++;
      }
      System.out.println();
      
      if(helperQueue.size() == 0 && helperStack.size() == 0){
        break;
      }
      queue = helperQueue;
      helperQueue = new ArrayDeque<>();

      stack = helperStack;
      helperStack = new Stack<>();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    levelOrderLinewiseZZ(root);
  }
}