class Nhanvienfulltime extends Nhanvien {
    int soTienThuong;
    int soTienPhat;
    int luongCung;

    public Nhanvienfulltime(int maNV, String hoTen, int tuoi, String soDienThoai, String email, int soTienThuong, int soTienPhat, int luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }
}