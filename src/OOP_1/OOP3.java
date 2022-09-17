package OOP_1;
class SinhVien {
    private int maSV;
    private String tenSV;
    private float diemTL, diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, float diemTL, float diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTL = diemTL;
        this.diemTH = diemTH;
    }
    public void setMaSV(int maSV){
        this.maSV = maSV;
    }
    public void setTenSV(String tenSV){
        this.tenSV = tenSV;
    }
    public void setDiemTL(float diemTL){
        this.diemTL = diemTL;
    }
    public void setDiemTH(float diemTH){
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public float getDiemTL() {
        return diemTL;
    }
    public float getAVG(){
        return (diemTH +diemTL)/2;
    }
    public String toString(){
        return maSV + " " + tenSV + " " + diemTH + " " + diemTL;
    }

}
public class OOP3 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        SinhVien sv1 = new SinhVien(1001, "Phuc", 6, 8);
        sv.setMaSV(1002);
        sv.setTenSV("Khang");
        sv.setDiemTL(6);
        sv.setDiemTH(7);
        System.out.println(sv.toString());
        System.out.println(sv1.toString());
    }
}
