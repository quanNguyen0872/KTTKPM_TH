package iuh.fit.se.SpringDataJPA_NHQ.service;

import java.util.List;

import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;

public interface NhanVienService {
	// Câu 3:
	public List<NhanVien> getNhanVienWithLuongNhoHon10000();
	// Câu 8:
	public int getTongLuongTraNhanVien();
	// Câu 9:
	public List<NhanVien> getPhiCongLaiBoeing();
}
