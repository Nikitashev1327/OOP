import java.util.*;
import java.lang.*;
import java.io.*;

class Primes {
    public static void main (String[] args){
        for (int j = 2; j <= 100; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String Linput = input.toLowerCase();
        String[] Lsplit = Linput.split(" ");
        String[] split = input.split(" ");
        for (int j = 0; j < Lsplit.length; j++){
            if (!Palindrom(Lsplit[j])){
                System.out.print("(NO)  ");
            }else {
                System.out.print("(YES) ");
            }
            System.out.print(split[j]);
            System.out.print(" ");
            if (!Palindrom(Lsplit[j])){
                System.out.print("IS NOT ");
            }else{
                System.out.print("IS ");
            }
            System.out.println("a Palindrom");
        }
        return;
    }
    public static boolean isPrime (int n){
        int del = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                del = del + 1;
            }
        }
        boolean ret = false;
        if (del==2){
            ret = true;
        }
        return ret;
    }
    public static boolean Palindrom(String s){
        String g = "";
        String f = "";
        for (int i = 1; i < s.length()+1; i++){
            g += s.charAt(s.length()-i);
            f += s.charAt(i-1);
        }
        if (g.equals(f)){
            return true;
        }else{
            return false;
        }
    }
}
