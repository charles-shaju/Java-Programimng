import java.util.Scanner;


class SearchSort {
    public int[] read(int[] a, int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            a[i] = s.nextInt();
        }
        return a;
    }
    public void display(int[] a) {
        System.out.println("Elements in the array are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println(); 
    }
    public void sort(int[] a) {
        int n = a.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public void search(int[] a, int s) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
class SearchSortM {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        SearchSort obj = new SearchSort(); 
        obj.read(a, n);
        obj.display(a);
        System.out.println("\nSorting: ");
        obj.sort(a);
        obj.display(a);
        System.out.println("\nSearching");
        System.out.print("Enter the element to be searched: ");
        int key = s.nextInt();
        obj.search(a, key);
    }
}