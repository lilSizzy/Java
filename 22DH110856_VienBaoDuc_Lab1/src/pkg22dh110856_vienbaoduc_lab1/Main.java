/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22dh110856_vienbaoduc_lab1;

import java.util.Scanner;


/**
 *
 * @author SV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Bai 1
        
        /*
        Scanner scanner = new Scanner(System.in);
    System.out.println("Moi Nhap So Nguyen : ");
    int a = scanner.nextInt();
    System.err.println(a % 2 == 0 ? "Chan" : "Le");
        */
    
        //Bai 2 
        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nhập số dự đoán
        System.out.print("Nhập số dự đoán (2 chữ số): ");
        int guess = scanner.nextInt();

        // Tạo số ngẫu nhiên từ 10 đến 99
        int lottery = 10 + random.nextInt(90);

        // Tách chữ số của guess và lottery
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        System.out.println("Số trúng thưởng là: " + lottery);

        // So sánh các trường hợp
        if (guess == lottery) {
            System.out.println("Chúc mừng! Trúng $10.000");
        } else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
            System.out.println("Chúc mừng! Trúng $3.000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                   guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Chúc mừng! Trúng $1.000");
        } else {
            System.out.println("Rất tiếc! Không trúng thưởng.");
        }

        scanner.close();
        */
        //Bai 3
        /*
        System.setOut(new PrintStream(System.out, true,"UTF-8"));
        Scanner scanner = new Scanner(System.in,"UTF-8");
        System.out.println("Moi nhap so a : ");
        int a = scanner.nextInt();
        System.out.println("Moi Nhap so b : ");
        int b = scanner.nextInt();
        System.out.println("Nhap toan tu (+ , - , * , /) : ");
        char operator = scanner.next().charAt(0);
        tinhToan(a,b,operator);
        scanner.close();
        */
        //Bai4
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi Nhap so nguyen tu 0 - 9 : ");
        int so = scanner.nextInt();
        DoiSoThanhChu(so);
        scanner.close();
        */
        //Bai 5
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi Nhap diem so tu 0 - 10: ");
        double diemso = scanner.nextInt();
        DoiDiemSoThanhChu(diemso);
        scanner.close();
        */
    }
    //Bai 3
    /*
    public static void tinhToan(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Kết quả: " + (a + b));
                break;
            case '-':
                System.out.println("Kết quả: " + (a - b));
                break;
            case '*':
                System.out.println("Kết quả: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Kết quả: " + (a / b));
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ.");
        }
    }
    */
    //Bai 4
    /*
    public static void DoiSoThanhChu(int so)
    {
        switch(so){
            case 0: 
            System.out.println("khong");
            break;
            case 1:
            System.out.println("Mot");
            break;
            case 2:
            System.out.println("Hai");
            break;
            case 3:
            System.out.println("Ba");
            break;
            case 4:
            System.out.println("Bon");
            break;
            case 5:
            System.out.println("Nam");
            break;
            case 6:
            System.out.println("Sau");
            break;
            case 7:
            System.out.println("Bay");
            break;
            case 8:
            System.out.println("Tam");
            break;
            case 9:
            System.out.println("Chin");
            break;
        }
    }
    */
    //Bai 5
    /*
    public static void DoiDiemSoThanhChu (double diemso) 
    {
        if(diemso >= 8 && diemso <= 10)
        {
            System.out.println("Xem loai A");
        }
        else if(diemso >= 7 && diemso < 8)
        {
            System.out.println("Xem loai B");
        }
        else if(diemso >= 5.0 && diemso < 7.0)
        {
            System.out.println("Xem loai C");
        }
        else if(diemso >= 0 && diemso < 5 ) 
        {
            System.out.println("Xep loai D");
        } else {
            System.out.println("Diem khong hop le, Vui long nhap tu 0 den 10 ");
        }
    }
    */
}
