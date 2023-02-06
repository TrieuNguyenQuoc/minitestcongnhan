import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nhanvien> nhanViens = new ArrayList<>();
        Nhanvienfulltime nvFulltime1 = new Nhanvienfulltime("01", "Nguyen Van A", 20, "0123456789", "nv1@email.com", 5000000, 200000, 10000000);
        Nhanvienfulltime nvFulltime2 = new Nhanvienfulltime("02", "Nguyen Van B", 25, "0123456789", "nv2@email.com", 7000000, 500000, 11000000);
        NhanVienParttime nvParttime1 = new NhanVienParttime("03", "Nguyen Van C", 20, "0123456789", "nv3@email.com", 150);
        NhanVienParttime nvParttime2 = new NhanVienParttime("04", "Nguyen Van D", 25, "0123456789", "nv4@email.com", 200);
        nhanViens.add(nvFulltime1);
        nhanViens.add(nvFulltime2);
        nhanViens.add(nvParttime1);
        nhanViens.add(nvParttime2);

        System.out.println("Trung binh luong nhan vien: " + "Luongfulltimevaparttime(nhanViens)");

        System.out.println("Danh sach nhan vien toan thoi gian co muc luong thap hon muc luong trung binh: ");
        ArrayList<Nhanvienfulltime> nvFulltimeThapHonTB = nhanvienfulltime(nhanViens);
        for (Nhanvienfulltime nvFulltime : nvFulltimeThapHonTB) {
            System.out.println(nvFulltime.toString());
        }

        System.out.println("Tong so tien phai tra cho nhan vien parttime: " + "Nhanvienfulltime(nhanViens)");

        System.out.println("Danh sach nhan vien fulltime sap xep theo luong tang dan: ");
        Collections.sort(nhanViens, new Nhanvienfulltime ());
        for (Nhanvien nv : nhanViens) {
            if (nv instanceof Nhanvienfulltime) {
                System.out.println(nv.toString());
            }
        }
    }
}