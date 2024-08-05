public class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDang;

    public TaiKhoanForum() {

    }

    public TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDang = soBaiDang;
    }

    public boolean doiMatKhau(String old_pw, String new_pw) {
        if (old_pw.equals(this.password)) {
            this.password = new_pw;
            return true;
        }
        return false;
    }

    public String loaiThanhVien() {
        if (this.soBaiDang >= 50) {
            return "Thanh vien VIP";
        } else if (this.soBaiDang >= 30) {
            return "Thanh vien nang dong";
        } else if (this.soBaiDang >= 5) {
            return "Thanh vien co dong gop";
        }
        return "Thanh vien moi";
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", this.tenDangNhap, this.ngayTao, this.loaiThanhVien());
    }

    public static void main(String[] args) {
        TaiKhoanForum tkforum = new TaiKhoanForum("hai", "hai123", "05/08/2024", 100);

        System.out.println("Doi mat khau: " + tkforum.doiMatKhau("hai123", "hai222"));
        System.out.println(tkforum.toString());

    }
}
