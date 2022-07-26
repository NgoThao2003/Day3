
import java.util.Scanner;
public class Bai1 {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n;
        System.out.print(" nhap vao so phan tu cua mang:");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println(" nhap mang:");
        nhap(arr, n);
        System.out.println("xuat mang:");
        xuat(arr);

        tinhTBC(arr,n);

        timVTNN(arr,n);
        kiemTra(arr,n);

        System.out.println(" so nguyen to la: ");
        KiemTraSNT(n);
        SNT(arr,n);

        System.out.println(" mang sau khi sap xep la: ");
        SapXep(arr);
        xuat(arr);
    }

    public static void nhap(int arr[] , int n){
        for (int i = 0 ; i < n ; i++){
            System.out.printf(" arr[%d] = " , i);
            arr[i] = scanner.nextInt();
        }
    }
    public static void xuat(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }
    public static int tinhTBC(int arr[],int n){
        int tbc = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] % 2 == 1) {
                tbc += arr[i];
            }
        }
        System.out.println("trung binh cong cac so le o vi tri chan= " + tbc);
        return tbc;
    }
    public static void timVTNN(int arr[], int n) {
        int min = arr[0];
        System.out.print(" vi tri cac so nho nhat trong mang:");
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                System.out.println(i+1);
            }

        }
    }
        public static void kiemTra ( int arr[], int n){
            System.out.println(" so chinh phuong la:");
            for (int i = 0; i < n; i++) {
                if (Math.sqrt(arr[i]) % 1 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
        public static boolean KiemTraSNT ( int n){
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;

                }
            }
            for (int i = 0; i < n; i++) {
                if (n == 1) {
                    return false;
                }
            }
            return true;
        }
        public static void SNT ( int arr[], int n){
            for (int i = 0; i < n; i++) {
                if (KiemTraSNT(arr[i]) == true) {
                    System.out.println(" " + arr[i]);
                }
            }
        }
        public static void SapXep ( int arr[]){
            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
}