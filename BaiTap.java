
package ProjectSGK;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




public class BaiTap extends SGK {


    public BaiTap() {
    }

    public BaiTap(String maSach, String tenSach, int namXuatBan, String nhaXuatBan, int soLuong,double giaSach,Date ngayNhap,Date ngayXuat){
        super(maSach, tenSach, namXuatBan, nhaXuatBan, soLuong, giaSach, ngayNhap, ngayXuat);

    }


@Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ngayNhapBT = sdf.format(ngayNhap);
        return "Sach Bai Tap : \n" + "Ma Sach :" + maSach + ", Ten sach " + tenSach + ", Nam xuat ban : " + namXuatBan+ ", Nha xuat ban :" + nhaXuatBan + ", So luong : "+soLuong+", Gia sach : "+giaSach+", ngay nhap kho="+ngayNhapBT;
    }
    @Override
        public Date hien(int day,int month,int year){
        Calendar cl = Calendar.getInstance();
        cl.set(year, month-1, day);
        return this.ngayNhap = cl.getTime();
    }
    @Override
        public Date xuat(int day,int month,int year){
        Calendar cl = Calendar.getInstance();
        cl.set(year, month-1, day);
        return this.ngayXuat=cl.getTime();
    }
}  

    


 