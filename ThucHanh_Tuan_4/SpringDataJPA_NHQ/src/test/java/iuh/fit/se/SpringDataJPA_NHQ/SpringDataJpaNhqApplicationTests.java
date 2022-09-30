package iuh.fit.se.SpringDataJPA_NHQ;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;
import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;
import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;
import iuh.fit.se.SpringDataJPA_NHQ.repository.ChuyenBayRepository;
import iuh.fit.se.SpringDataJPA_NHQ.repository.MayBayRepository;
import iuh.fit.se.SpringDataJPA_NHQ.repository.NhanVienRepository;

@SpringBootTest
class SpringDataJpaNhqApplicationTests {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;
	
	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	// Test câu 1:
	@Test
	public void findChuyenBayByGaDen() {
		List<ChuyenBay> chuyenbays = chuyenBayRepository.findChuyenBayByGaDen();
		for (ChuyenBay chuyenBay : chuyenbays) {
			System.out.println(chuyenBay.toString());
		}
	}
	
	// Test câu 2:
	@Test
	public void getMayBayByTamBay() {
		List<MayBay> maybays = mayBayRepository.getMayBayByTamBay();
		for (MayBay mayBay : maybays) {
			System.out.println(mayBay.toString());
		}
	}
	
	// Test câu 3:
	@Test
	public void getNhanVienWithLuongNhoHon10000() {
		List<NhanVien> nhanViens = nhanVienRepository.getNhanVienWithLuongNhoHon10000();
		for (NhanVien nhanVien : nhanViens) {
			System.out.println(nhanVien.toString());
		}
	}
	
	// Test câu 4:
	@Test
	public void findChuyenBayCoDoDaiNhoHon10000VaLonHon8000() {
		List<ChuyenBay> chuyenBayscau4 = chuyenBayRepository.findChuyenBayCoDoDaiNhoHon10000VaLonHon8000();
		for (ChuyenBay chuyenBay : chuyenBayscau4) {
			System.out.println(chuyenBay.toString());
		}
	}
	
	// Test câu 5:
	@Test
	public void findChuyenBayTuSGNdiBMV() {
		List<ChuyenBay> chuyenBayscau5 = chuyenBayRepository.findChuyenBayTuSGNdiBMV();
		for (ChuyenBay chuyenBay : chuyenBayscau5) {
			System.out.println(chuyenBay.toString());
		}
	}
	
	// Test câu 6:
	@Test
	public void findChuyenBayGaDiSGN() {
		List<ChuyenBay> chuyenBayscau6 = chuyenBayRepository.findChuyenBayGaDiSGN();
		for (ChuyenBay chuyenBay : chuyenBayscau6) {
			System.out.println(chuyenBay.toString());
		}
	}
	
	// Test câu 7:
	@Test
	public void getMayBayByLoaiBoeing() {
		List<String> mayBayBoeings = mayBayRepository.getMayBayByLoaiBoeing();
		for (String loaiBoeing : mayBayBoeings) {
			System.out.println(loaiBoeing);
		}
	}
	
	// Test câu 8:
	@Test
	public void getTongLuongTraNhanVien() {
		int totalLuong = nhanVienRepository.getTongLuongTraNhanVien();
		System.out.println("Tổng lương phải trả cho nhân viên là: " + totalLuong + " $$$");
	}
	
	// Test câu 9:
	@Test
	public void getPhiCongLaiBoeing() {
		List<NhanVien> listPhiCongLaiBoeing = 
				nhanVienRepository.getPhiCongLaiBoeing();
		for (NhanVien phiCong : listPhiCongLaiBoeing) {
			System.out.println(phiCong.toString());
		}
	}
}
