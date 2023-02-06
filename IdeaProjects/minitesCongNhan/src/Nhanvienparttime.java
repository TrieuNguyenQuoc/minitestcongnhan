    class NhanVienParttime extends Nhanvienfulltime {
        int soGioLamViec;

        public NhanVienParttime(int maNV, String hoTen, int tuoi, String soDienThoai, String email, int soGioLamViec) {
            super(maNV, hoTen, tuoi , soDienThoai,email, soGioLamViec );
            this.soGioLamViec = soGioLamViec;
        }
    }
