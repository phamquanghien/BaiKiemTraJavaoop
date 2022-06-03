import java.util.Scanner;

public class Person
{
    public String PersonID;
    public String PersonName;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        //thong bao cho nguoi dung biet can nhap gi
        System.out.print("Nhap vao ID: ");
        //doc du lieu nguoi dung nhap vao tu ban phim
        PersonID = sc.nextLine();
        System.out.print("Nhap vao name: ");
        PersonName = sc.nextLine();
    }
    public void HienThi(){
        System.out.print("ID: " + PersonID);
        System.out.print("; Name: " + PersonName);
    }
}