// QUESTION URL :- https://nados.io/question/normal-queue?zen=true
import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
    }

    int size() {
      return this.size;
    }

    void display() {
      // write ur code here
      for(int i = 0; i<size; i++){
        System.out.print(data[(front+i)%data.length] + " ");
      }
      System.out.println();
    }

    void add(int val) {
      // write ur code here
      if(size<this.data.length){
        int idx = (front+size)%data.length;
        this.data[idx] = val;
        size++;
      }
      else{
        System.out.println("Queue overflow");
      }
    }

    int remove() {
      // write ur code here
      if(this.size<=0){
        return -1;
      }
      else{
        int temp = data[front];
        front = (front+1)%data.length;
        this.size--;
        // System.out.println("front is " + front);
        return temp;
      }
    }

    int peek() {
       // write ur code here
      if(size == 0){
        return -1;
      }
       return this.data[front];
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
        else{
          System.out.println("Queue underflow");
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
        else{
          System.out.println("Queue underflow");
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}