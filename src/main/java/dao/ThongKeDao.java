package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.BangDia;
<<<<<<< HEAD
<<<<<<< HEAD
import entity.PhieuThue;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import entity.PhieuThue;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import service.ThongKeServices;

public class ThongKeDao extends AbstractDao implements ThongKeServices{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6078558180453000214L;

	public ThongKeDao(EntityManagerFactory emf) throws RemoteException{
		super(emf);
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
	@SuppressWarnings("unchecked")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	@Override
	public List<BangDia> getBangDiaHong() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia WHERE tinhTrang LIKE " +  "'%" + "Hong" + "%'";
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> l = query.getResultList();
		em.getTransaction().commit();
<<<<<<< HEAD
<<<<<<< HEAD
		
		return l;
	}
	
	@Override
	public List<BangDia> getBangDiaYeuThich() {
		em.getTransaction().begin();
		
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		return l;
	}
	
	@Override
	public List<BangDia> getBangDiaYeuThich() {
		em.getTransaction().begin();
<<<<<<< HEAD

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		String statement = "SELECT TOP 10 ChiTietPhieuThue.maBD, tenBD, theLoai, tinhTrang, soLuong, soNgayMuon, donGia, hangSX, ghiChu\r\n"
				+ "FROM ChiTietPhieuThue \r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD GROUP BY ChiTietPhieuThue.maBD, tenBD, theLoai, tinhTrang, soLuong, soNgayMuon, donGia, hangSX, ghiChu";
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> l = query.getResultList();
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		
//		for(BangDia bd : l) {
//			System.out.println(bd.getTenBD() + bd.getSoNgayMuon() + bd.getHangSX());
//		}
	
<<<<<<< HEAD
		em.getTransaction().commit();
		return l;
	}
	
	@Override
	public List<String> getDate() {
		em.getTransaction().begin();
		
		List<String> lAdd = new ArrayList<>();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String statement = "SELECT ngayThue FROM PhieuThue";
		Query query = em.createNativeQuery(statement);
		List<String> lDate = query.getResultList();
		
		String statement1 = "SELECT soNgayMuon FROM PhieuThue";
		Query query1 = em.createNativeQuery(statement1);
		List<Integer> lPlus = query1.getResultList();
		
		Date currentDate = new Date();
		
		int listSize = lDate.size();
		
=======

		//		for(BangDia bd : l) {
		//			System.out.println(bd.getTenBD() + bd.getSoNgayMuon() + bd.getHangSX());
		//		}

=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		em.getTransaction().commit();
		return l;
	}
	
	@Override
	public List<String> getDate() {
		em.getTransaction().begin();
		
		List<String> lAdd = new ArrayList<>();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String statement = "SELECT ngayThue FROM PhieuThue";
		Query query = em.createNativeQuery(statement);
		List<String> lDate = query.getResultList();
		
		String statement1 = "SELECT soNgayMuon FROM PhieuThue";
		Query query1 = em.createNativeQuery(statement1);
		List<Integer> lPlus = query1.getResultList();
		
		Date currentDate = new Date();
		
		int listSize = lDate.size();
<<<<<<< HEAD

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		for(int i = 0; i < listSize; i++) {
			try {
				Date dateForm = new SimpleDateFormat("dd/MM/yyyy").parse(lDate.get(i));
				System.out.println(dateFormat.format(dateForm));
<<<<<<< HEAD
<<<<<<< HEAD
				
				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
		        c.add(Calendar.YEAR, 0);
		        c.add(Calendar.MONTH, 0);
		        c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));
		        
		        Date plusDate = c.getTime();
		        
		        System.out.println(dateFormat.format(plusDate));
		        
		        if(plusDate.after(currentDate)) {
		        	lAdd.add("Chưa hết hạn");
		        } 
		        else {
		    		lAdd.add("Hết hạn");
		        }
=======

				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
				c.add(Calendar.YEAR, 0);
				c.add(Calendar.MONTH, 0);
				c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));

				Date plusDate = c.getTime();

				System.out.println(dateFormat.format(plusDate));

				if(plusDate.after(currentDate)) {
					lAdd.add("Chưa hết hạn");
				} 
				else {
					lAdd.add("Hết hạn");
				}
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				
				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
		        c.add(Calendar.YEAR, 0);
		        c.add(Calendar.MONTH, 0);
		        c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));
		        
		        Date plusDate = c.getTime();
		        
		        System.out.println(dateFormat.format(plusDate));
		        
		        if(plusDate.after(currentDate)) {
		        	lAdd.add("Chưa hết hạn");
		        } 
		        else {
		    		lAdd.add("Hết hạn");
		        }
>>>>>>> parent of 8ab78b7 (fix all code sever)
			} 
			catch(ParseException e) {
				e.printStackTrace();
			}
		}
<<<<<<< HEAD
<<<<<<< HEAD
		
		em.getTransaction().commit();
		return lAdd;
		
//		for(Integer a : lPlus) {
//			System.out.println(a);
//			
//			for(String p : lDate) {
//				try {
//					Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p);
//					System.out.println(dateFormat.format(date1));
//					
//			        Calendar c = Calendar.getInstance();
//			        c.setTime(date1);
//			        c.add(Calendar.YEAR, 0);
//			        c.add(Calendar.MONTH, 0);
//			        c.add(Calendar.DAY_OF_MONTH, 30);
//			        
//			        Date plusDate = c.getTime();
//			        
//			        System.out.println(dateFormat.format(plusDate));
//			        
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}  
//			}
//		}
//		
//		for(String p : lDate) {
//			try {
//				Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p);
//				System.out.println(dateFormat.format(date1));
//				
//		        Calendar c = Calendar.getInstance();
//		        c.setTime(date1);
//		        c.add(Calendar.YEAR, 0);
//		        c.add(Calendar.MONTH, 0);
//		        c.add(Calendar.DAY_OF_MONTH, 30);
//		        
//		        Date plusDate = c.getTime();
//		        
//		        System.out.println(dateFormat.format(plusDate));
//		        
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}  
//			
//		}
	}
	
	@Override
	public List<String> getDateByCMND(String cmnd) {
		em.getTransaction().begin();
		
		List<String> lAdd = new ArrayList<>();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String statement = "SELECT ngayThue FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement);
		List<String> lDate = query.getResultList();
		
		String statement1 = "SELECT soNgayMuon FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query1 = em.createNativeQuery(statement1);
		List<Integer> lPlus = query1.getResultList();
		
		Date currentDate = new Date();
		
		int listSize = lDate.size();
		
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		em.getTransaction().commit();
		return lAdd;
		
//		for(Integer a : lPlus) {
//			System.out.println(a);
//			
//			for(String p : lDate) {
//				try {
//					Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p);
//					System.out.println(dateFormat.format(date1));
//					
//			        Calendar c = Calendar.getInstance();
//			        c.setTime(date1);
//			        c.add(Calendar.YEAR, 0);
//			        c.add(Calendar.MONTH, 0);
//			        c.add(Calendar.DAY_OF_MONTH, 30);
//			        
//			        Date plusDate = c.getTime();
//			        
//			        System.out.println(dateFormat.format(plusDate));
//			        
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}  
//			}
//		}
//		
//		for(String p : lDate) {
//			try {
//				Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(p);
//				System.out.println(dateFormat.format(date1));
//				
//		        Calendar c = Calendar.getInstance();
//		        c.setTime(date1);
//		        c.add(Calendar.YEAR, 0);
//		        c.add(Calendar.MONTH, 0);
//		        c.add(Calendar.DAY_OF_MONTH, 30);
//		        
//		        Date plusDate = c.getTime();
//		        
//		        System.out.println(dateFormat.format(plusDate));
//		        
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}  
//			
//		}
	}
	
	@Override
	public List<String> getDateByCMND(String cmnd) {
		em.getTransaction().begin();
		
		List<String> lAdd = new ArrayList<>();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String statement = "SELECT ngayThue FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement);
		List<String> lDate = query.getResultList();
		
		String statement1 = "SELECT soNgayMuon FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query1 = em.createNativeQuery(statement1);
		List<Integer> lPlus = query1.getResultList();
		
		Date currentDate = new Date();
		
		int listSize = lDate.size();
<<<<<<< HEAD

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		for(int i = 0; i < listSize; i++) {
			try {
				Date dateForm = new SimpleDateFormat("dd/MM/yyyy").parse(lDate.get(i));
				System.out.println(dateFormat.format(dateForm));
<<<<<<< HEAD
<<<<<<< HEAD
				
				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
		        c.add(Calendar.YEAR, 0);
		        c.add(Calendar.MONTH, 0);
		        c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));
		        
		        Date plusDate = c.getTime();
		        
		        System.out.println(dateFormat.format(plusDate));
		        
		        if(plusDate.after(currentDate)) {
		        	lAdd.add("Chưa hết hạn");
		        } 
		        else {
		    		lAdd.add("Hết hạn");
		        }
=======

				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
				c.add(Calendar.YEAR, 0);
				c.add(Calendar.MONTH, 0);
				c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));

				Date plusDate = c.getTime();

				System.out.println(dateFormat.format(plusDate));

				if(plusDate.after(currentDate)) {
					lAdd.add("Chưa hết hạn");
				} 
				else {
					lAdd.add("Hết hạn");
				}
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				
				Calendar c = Calendar.getInstance();
				c.setTime(dateForm);
		        c.add(Calendar.YEAR, 0);
		        c.add(Calendar.MONTH, 0);
		        c.add(Calendar.DAY_OF_MONTH, lPlus.get(i));
		        
		        Date plusDate = c.getTime();
		        
		        System.out.println(dateFormat.format(plusDate));
		        
		        if(plusDate.after(currentDate)) {
		        	lAdd.add("Chưa hết hạn");
		        } 
		        else {
		    		lAdd.add("Hết hạn");
		        }
>>>>>>> parent of 8ab78b7 (fix all code sever)
			} 
			catch(ParseException e) {
				e.printStackTrace();
			}
		}
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		em.getTransaction().commit();
		return lAdd;
	}
}
