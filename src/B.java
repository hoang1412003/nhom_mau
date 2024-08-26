public class B extends NhomMau{
    public B() {
        this.loaiMau = _B;
    }

    @Override
    public boolean kiemTraDichuyen(NhomMau cha, NhomMau con) {
        if(cha.getLoaiMau() == _O || cha.getLoaiMau() ==_B) {
            if(con.getLoaiMau() == _B || con.getLoaiMau() == _O) {
                return true;
            }
        } else if (cha.getLoaiMau()==_A) {
            return true;
        } else if (cha.getLoaiMau() == _AB) {
            if(con.getLoaiMau() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean kiemTraNhomMau(NhomMau nhan) {
        if(nhan.getLoaiMau() ==_B || nhan.getLoaiMau() ==_AB) {
            return true;
        }
        return false;
    }
}
