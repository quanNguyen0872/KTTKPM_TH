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
}
