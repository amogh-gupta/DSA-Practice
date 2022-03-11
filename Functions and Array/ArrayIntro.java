public class ArrayIntro {
    public static void main(String[] args) {
        // Initialisng an array
        int arr[] = new int[3];

        // Printing default value of int array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        // Initialising value to array element
        arr[0] = 4;
        arr[1] = 6;
        arr[2] = 13;

        // Printing value of int array after reinitiallising
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        // Printing length of an array
        System.out.println("Length: " + arr.length);

        // USing for loop Printing value stored in array 
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // USing for each loop Printing value stored in array 
        for(int var : arr){
            System.out.println(var);
        }
    }
    
}
