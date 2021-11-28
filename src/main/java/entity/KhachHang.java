package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String soCMND;
	private String hoTen;
	private String gioiTinh;
	private String dienThoai;
	private String diaChi;
	@OneToMany(mappedBy = "CMND", cascade = CascadeType.ALL)
	private Set<PhieuThue> phieuThue = new HashSet<>();
	
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(String hoTen, String gioiTinh, String dienThoai, String diaChi, String soCMND) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
		this.soCMND = soCMND;
	}

	public KhachHang(String soCMND) {
		super();
		this.soCMND = soCMND;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	@Override
	public int hashCode() {
		return Objects.hash(soCMND);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(soCMND, other.soCMND);
	}

}
