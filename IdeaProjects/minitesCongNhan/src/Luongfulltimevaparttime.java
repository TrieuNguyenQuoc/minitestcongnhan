public class Luongfulltimevaparttime {
    public int calculateFulltimeSalary(Nhanvienfulltime nvFulltime) {
        return nvFulltime.luongCung + (nvFulltime.soTienThuong - nvFulltime.soTienPhat);
    }

    public int calculateParttimeSalary(NhanVienParttime nvParttime) {
        return nvParttime.soGioLamViec * 100000;
    }
}
