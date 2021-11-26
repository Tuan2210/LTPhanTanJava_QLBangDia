package service;

import java.util.List;

import entity.PhieuThue;

public interface PhieuThueServices {
	public void add(PhieuThue pt);
	public List<PhieuThue> getAllPhieuThue();
	public void removePhieuThue(int id);
	public void updatePhieuThue(PhieuThue pt);
	public List<PhieuThue> findPhieuThue(int id);
}
