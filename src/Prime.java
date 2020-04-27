import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count=0;
        int n=2;
        boolean check=false;
        String result= "";
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập Số Nguyên Tố Cần In Ra");
        int number=input.nextInt();
            while (count<number){
                check=chechNumber(n);
                if (check){
                    result+=n+"-";
                    count++;
                }
                n++;
            }
        System.out.print(input+" So nguyen to dau tien: "+result);
    }
    public static boolean chechNumber(int x){
        if (x<2){
            return false;
        }else {
            for (int i=2;i<x-1;i++){
                if (x%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
