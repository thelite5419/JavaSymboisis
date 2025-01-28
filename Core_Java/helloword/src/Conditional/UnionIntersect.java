package Conditional;

public class UnionIntersect {
    public static void main(String[] args) {
        int[] a = {8, 1, 6, 3, 6};
        int[] b = {5, 4, 8, 6, 9};                
       
        int[] union = new int[a.length + b.length];
        int[] intersection = new int[Math.min(a.length, b.length)];
        int unionIndex = 0;
        int intersectionIndex = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (!isPresent(union, unionIndex, a[i])) {
                union[unionIndex++] = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (!isPresent(union, unionIndex, b[i])) {
                union[unionIndex++] = b[i];
            }
            if (isPresent(a, a.length, b[i]) && !isPresent(intersection, intersectionIndex, b[i])) {
                intersection[intersectionIndex++] = b[i];
            }
        }

        
        System.out.println("Union:");
        for (int i = 0; i < unionIndex; i++) {
            System.out.print(union[i] + " ");
        }

        System.out.println("\nIntersection:");
        for (int i = 0; i < intersectionIndex; i++) {
            System.out.print(intersection[i] + " ");
        }
    }

   
    static boolean isPresent(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false; 
    }
}
