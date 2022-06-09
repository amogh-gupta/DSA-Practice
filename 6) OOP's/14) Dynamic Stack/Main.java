// Question URL: - https://nados.io/question/dynamic-stack
import java.io.*;

public class Main {

  public static class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      return tos + 1;
    }

    void display() {
      for (int i = tos; i >= 0; i--) {
        System.out.print(data[i] + " ");
      }
      System.out.println();
    }

    int[] newArr(int[] old){
      int len = old.length;
      int[] arr = new int[2*len];
      for(int i = 0; i<len; i++){
        arr[i] = old[i];
      }
      
      return arr;
    }
    // change the code of this function according to question
    void push(int val) {
      if (tos == data.length - 1) {
        this.data = newArr(data);
      }
      tos++;
      data[tos] = val;
      
    }

    int pop() {
      if (tos == -1) {
        System.out.println("Stack underflow");
        return -1;
      } else {
        int val = data[tos];
        tos--;
        return val;
      }
    }

    int top() {
      if (tos == -1) {
        System.out.println("Stack underflow");
        return -1;
      } else {
        return data[tos];
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("display")) {
        st.display();
      }
      str = br.readLine();
    }
  }
}