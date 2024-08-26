import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private List<NhomMau> arr;
    public DanhSachNhomMau() {
        this.arr=new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Nhap thong tin nguoi thu "+(i+1));
            System.out.println("1. Nhom 0");
            System.out.println("2. Nhom A");
            System.out.println("3. Nhom B");
            System.out.println("4. Nhom AB");
            System.out.println("1. Moi ban lua chon nhom mau");
            int flag = sc.nextInt();
            if(flag==1) {
                NhomMau x = new O();
                x.nhap();
                this.arr.add(x);
            } else if (flag == 2) {
                NhomMau x = new A();
                x.nhap();
                this.arr.add(x);
            } else if (flag ==3) {
                NhomMau x = new B();
                x.nhap();
                this.arr.add(x);
            } else if (flag == 4) {
                NhomMau x = new AB();
                x.nhap();
                this.arr.add(x);
            }
        }
    }
    public void xuat() {
        for (NhomMau x: this.arr) {
            x.xuat();
        }
    }
    public void cau2() {
        NhomMau me = new A();
        NhomMau cha = new B();
        NhomMau con = new A();

        if(me.kiemTraDichuyen(cha, con)) {
            System.out.println("Gia dinh nay phu hop voi quy luat duy chuyen");
        } else {
            System.out.println("Co gi do sai sai");
        }
    }

    public  void cau3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban chon 1 nguoi de nhan mau");
        int index = sc.nextInt();
        for(var i = 0;i<arr.size();i++) {
            if(i !=index) {
                if(this.arr.get(i).kiemTraChoNhan(this.arr.get(index))) {
                    System.out.printf("ban thu %d co the cho mau ban thu %d nhe \n", i,index);
                }
            }
        }
    }
}
