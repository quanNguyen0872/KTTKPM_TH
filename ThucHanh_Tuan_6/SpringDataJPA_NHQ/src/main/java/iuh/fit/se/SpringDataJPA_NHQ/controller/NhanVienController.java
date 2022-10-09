package iuh.fit.se.SpringDataJPA_NHQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;
import iuh.fit.se.SpringDataJPA_NHQ.service.NhanVienService;

@RestController
@RequestMapping("/nhanvien")
public class NhanVienController {
	
	@Autowired
	private NhanVienService nhanVienService;
	
	// Cau 3:
	@GetMapping("/Cau3")
	public List<NhanVien> getNhanVienWithLuongNhoHon10000() {
		return nhanVienService.getNhanVienWithLuongNhoHon10000();
	}
	// Cau 8:
	@GetMapping("/Cau8")
	public int getTongLuongTraNhanVien() {
		return nhanVienService.getTongLuongTraNhanVien();
	}
	// Cau 9:
	@GetMapping("/Cau9")
	public List<NhanVien> getPhiCongLaiBoeing() {
		return nhanVienService.getPhiCongLaiBoeing();
	}
	
}
