package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class PhieuThue {
	@Id
	private int soPhieu;
	@ManyToOne
	@JoinColumn(name = "soCMND")
	private KhachHang CMND;
	private String ngayThue;
	@ManyToMany
	@JoinTable(name = "ChiTietPhieuThue", joinColumns = @JoinColumn(name = "soPhieu"), inverseJoinColumns = @JoinColumn(name = "maBD"))
	private Set<BangDia> bangDia = new HashSet<>();
	private int soluong;
	private int soNgayMuon;
	private double donGia;
	@ManyToOne
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	public PhieuThue(int soPhieu, KhachHang cMND, String ngayThue, Set<BangDia> bangDia, int soluong, int soNgayMuon,
			double donGia, NhanVien nhanVien) {
		super();
		this.soPhieu = soPhieu;
		CMND = cMND;
		this.ngayThue = ngayThue;
		this.bangDia = bangDia;
		this.soluong = soluong;
		this.soNgayMuon = soNgayMuon;
		this.donGia = donGia;
		this.nhanVien = nhanVien;
	}

	public PhieuThue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSoPhieu() {
		return soPhieu;
	}

	public void setSoPhieu(int soPhieu) {
		this.soPhieu = soPhieu;
	}

	public KhachHang getCMND() {
		return CMND;
	}

	public void setCMND(KhachHang cMND) {
		CMND = cMND;
	}

	public String getNgayThue() {
		return ngayThue;
	}

	public void setNgayThue(String ngayThue) {
		this.ngayThue = ngayThue;
	}

	public Set<BangDia> getBangDia() {
		return bangDia;
	}

	public void setBangDia(Set<BangDia> bangDia) {
		this.bangDia = bangDia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
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

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
	
}
