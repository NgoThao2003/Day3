import java.util.Locale;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap vao chuoi: ");
        String a = scanner.nextLine();
        System.out.println(" chuoi a= " + a);


        System.out.print("chuoi sau khi xoa dau cach: ");
        System.out.println(a.replaceAll("\\s+", " ").trim());

// xoa het cac so trong chuoi
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                a = a.replace(String.valueOf(a.charAt(i)),"");//
                i--;

            }
        }
        System.out.print(" chuoi sau khi xoa so:");
        System.out.println(a);

        //viet hoa chu cai dau moi tu
        String arr[] = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String item = arr[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();  // ch = L
                item = ch + item.substring(1).toLowerCase(); // item = Linh
                sb.append(item).append(" "); //noi dau cach vao cuoi chuoi  " Linh "
            }
        }
        System.out.print("chuoi sau khi chuan hoa:");
        System.out.println(sb.toString());



    }
}
