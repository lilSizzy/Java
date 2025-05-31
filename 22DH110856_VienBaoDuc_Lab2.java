/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22dh110856_vienbaoduc_lab2;
import java.util.Scanner;
/**
 *
 * @author SV
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       //bai1();
       //bai2();
       //bai3();
       bai4();
    }
    
    public static void bai1() {
        
       
        System.out.print("Moi nhap so nguyen n : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int Tong = 0;
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("Moi nhap thu n " + (i+1) + ":");
            arr[i] = scanner.nextInt();
            Tong += arr[i];
        }
        System.out.println("Tong cac so nguyen = " + Tong);
        
        scanner.close();
       
    }
    public static void bai2()
    {
        System.out.print("Moi Nhap phan tu mang: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        //Nhap phan tu mang
        for(int i = 0; i < n; i++)
        {
            System.out.print("Moi nhap phan tu thu n" + (i+1)+ ":");
            arr[i] = scanner.nextInt();
            
        }
        int max = arr[0];
        int min = arr[1];
        
        for(int i = 0; i < n ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : " + max);
        System.out.println("Phan tu nho nhat trong mang la : " + min);
        scanner.close();
    }
    public static void bai3()
    {
        System.out.print("Moi nhap so phan tu mang: ");
        int n = scanner.nextInt();
        //Khoi tao mang
        int[] arr = new int[n];
        int sochan = 0;
        int sole = 0;
        
        //Duyet phan tu mang
        for(int i = 0; i< n; i++)
        {
            System.out.print("Moi nhap phan tu thu " +(i+1)+ ":");
            arr[i] = scanner.nextInt();           
        }
        for(int i =0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sochan++;
            } 
            else
            {
                sole++;
            }
        }
        System.out.println("Tong so chan la : " + sochan);
        System.out.println("Tong so le la : " +sole);
        scanner.close();
    }
    public static void bai4()
    {
        System.out.print("Moi nhap so phan tu mang: ");
        int n = scanner.nextInt();
        //Khoi tao mang
        int[] arr = new int[n];
        //Duyet phan tu mang
        for(int i = 0; i< n; i++)
        {
            System.out.print("Moi nhap phan tu thu " +(i+1)+ ":");
            arr[i] = scanner.nextInt();           
        }
        if(DoiXung(arr))
        {
            System.out.println("Mang doi xung.");
        } else
        {
            System.out.println("Mang khong doi xung");
        }
        scanner.close();
    }
    public static boolean DoiXung(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n /2 ; i++)
        {
            if(arr[i] != arr[n - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}
