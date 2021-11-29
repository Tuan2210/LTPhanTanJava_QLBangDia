package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class BangDia implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maBD;
	private String tenBD;
	private String theLoai;
	private String tinhTrang;
	private int soLuong;
	private int soNgayMuon;
	private double donGia;
	private String hangSX;
	private String ghiChu;
	@ManyToMany(mappedBy = "bangDia")
	private Set<PhieuThue> groups = new HashSet<>();

	public BangDia(String tenBD, String theLoai, String tinhTrang, int soLuong, int soNgayMuon, double donGia,
			String hangSX, String ghiChu) {
		super();
		this.tenBD = tenBD;
		this.theLoai = theLoai;
		this.tinhTrang = tinhTrang;
		this.soLuong = soLuong;
		this.soNgayMuon = soNgayMuon;
		this.donGia = donGia;
		this.hangSX = hangSX;
		this.ghiChu = ghiChu;
	}
	public int getMaBD() {
		return maBD;
	}
	public void setMaBD(int maBD) {
		this.maBD = maBD;
	}
	public String getTenBD() {
		return tenBD;
	}
	public void setTenBD(String tenBD) {
		this.tenBD = tenBD;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSoNgayMuon() {
		return soNgayMuon;
	}
	public void setSoNgayMuon(int soNgayMuon) {
		this.soNgayMuon = soNgayMuon;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public Set<PhieuThue> getGroups() {
		return groups;
	}
	public void setGroups(Set<PhieuThue> groups) {
		this.groups = groups;
	}
	public BangDia(int maBD, String tenBD, String theLoai, String tinhTrang, int soLuong, int soNgayMuon,
			double donGia, String hangSX, String ghiChu) {
		super();
		this.maBD = maBD;
		this.tenBD = tenBD;
		this.theLoai = theLoai;
		this.tinhTrang = tinhTrang;
		this.soLuong = soLuong;
		this.soNgayMuon = soNgayMuon;
		this.donGia = donGia;
		this.hangSX = hangSX;
		this.ghiChu = ghiChu;
	}

	public BangDia() {
		super();
	}

	public BangDia(int maBD) {
		super();
		this.maBD = maBD;
	}


	@Override
	public String toString() {
		return "BangDia [maBD=" + maBD + ", tenBD=" + tenBD + ", theLoai=" + theLoai + ", tinhTrang=" + tinhTrang
				+ ", soLuong=" + soLuong + ", soNgayMuon=" + soNgayMuon + ", donGia=" + donGia + ", hangSX=" + hangSX
				+ ", ghiChu=" + ghiChu + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maBD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BangDia other = (BangDia) obj;
		return maBD == other.maBD;
	}



}
