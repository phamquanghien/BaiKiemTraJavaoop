import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<NVN199> arrList = new ArrayList<>();
        int soPhanTu; String personID;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can them: ");
        soPhanTu = Integer.parseInt(sc.nextLine());
        NVN199 nvn = new NVN199();
        nvn.AddThongTin(arrList, soPhanTu);
        nvn.HienThiThongTin(arrList);
        System.out.println("Nhap ID can sua thong tin: ");
        personID = sc.nextLine();
        nvn.UpdateInformation(arrList, personID);
        nvn.HienThiThongTin(arrList);
    }
}
