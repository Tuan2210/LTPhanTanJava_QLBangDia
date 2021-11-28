package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NhanVien implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNV;
	private String tenNV;
	private String dienThoai;
	private String moTa;
	@OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private Set<PhieuThue> phieuThue = new HashSet<>();
	
	public NhanVien(String tenNV, String dienThoai, String moTa) {
		super();
		this.tenNV = tenNV;
		this.dienThoai = dienThoai;
		this.moTa = moTa;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}