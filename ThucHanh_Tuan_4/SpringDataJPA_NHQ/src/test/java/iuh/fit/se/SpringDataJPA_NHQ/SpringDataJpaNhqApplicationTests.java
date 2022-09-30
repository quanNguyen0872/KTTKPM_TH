package iuh.fit.se.SpringDataJPA_NHQ;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;
import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;
import iuh.fit.se.SpringDataJPA_NHQ.repository.ChuyenBayRepository;
import iuh.fit.se.SpringDataJPA_NHQ.repository.MayBayRepository;

@SpringBootTest
class SpringDataJpaNhqApplicationTests {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;
	
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

}
