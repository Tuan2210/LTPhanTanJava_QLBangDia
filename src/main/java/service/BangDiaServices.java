package service;

import java.util.List;

import entity.BangDia;

public interface BangDiaServices {
	public void add(BangDia b);
	public List<BangDia> getAllBangDia();
	public void removeBangDia(int id);
	public void updateBangDia(BangDia b);
	public List<BangDia> findBangDia(String ten);
	public BangDia getBangDiaByTen(String ten);
}
