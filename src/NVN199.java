import java.util.ArrayList;
import java.util.Scanner;

public class NVN199 extends Person{
    public String NVN199NCC;
    public String NVN199ABC;
    @Override
    public void NhapThongTin()
    {
        super.NhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap NVN199NCC: ");
        NVN199NCC = sc.nextLine();
        System.out.println("Nhap NVN199ABC: ");
        NVN199ABC = sc.nextLine();
    }
    @Override
    public void HienThi(){
        super.HienThi();
        System.out.print("; NVN199NCC: " + NVN199NCC);
        System.out.println("; NVN199ABC: " + NVN199ABC);
    }
    public void AddThongTin(ArrayList<NVN199> list, int n)
    {
        for(int i = 0; i < n; i++)
        {
            //nhap vao thong tin 1 doi tuong NVNV199 moi
            NVN199 nvn  = new NVN199();
            nvn.NhapThongTin();
            //add thong tin doi tuong vua nhap vao Array list
            list.add(nvn);
        }
    }
    public void UpdateInformation(ArrayList<NVN199> list, String perID){
        //can nhap vao PersonID de kiem tra
        boolean checkKey = false;
        for(int i = 0; i < list.size(); i++)
        {
            //neu ton tai du lieu nhap vao thi cho nhap du lieu moi va cap vao arrlist
            if(list.get(i).PersonID.equals(perID)){
                NVN199 nvn = new NVN199();
                nvn.NhapThongTin();
                list.set(i, nvn);
                checkKey = true;
            }
        }
        if(checkKey == true)
        {
            System.out.println("Thong tin da duoc cap nhat");
        }
        else{
            //neu khong ton tai du lieu nhap vao thi thong bao cho nguoi dung
            System.out.println("Khong ton tai du lieu nhap vao");
        }
    }
    public void HienThiThongTin(ArrayList<NVN199> list){
        for(NVN199 nvn: list){
            nvn.HienThi();
        }
    }
}
