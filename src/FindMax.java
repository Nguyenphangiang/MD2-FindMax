import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter size array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element : " + (i+1) + ": ");
            array[i]= sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Elements in array : ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index= 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max){
                max = array[j];
                index = j + 1;
            }
        } System.out.println("The largest property in array is : " + max + " index : " + index);

    }
}
