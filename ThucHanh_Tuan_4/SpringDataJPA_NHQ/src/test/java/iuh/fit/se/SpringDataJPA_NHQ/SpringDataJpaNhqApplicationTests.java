package iuh.fit.se.SpringDataJPA_NHQ;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;
import iuh.fit.se.SpringDataJPA_NHQ.repository.ChuyenBayRepository;

@SpringBootTest
class SpringDataJpaNhqApplicationTests {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;

	@Test
	public void findChuyenBayByGaDen() {
		List<ChuyenBay> chuyenbays = chuyenBayRepository.findChuyenBayByGaDen();
		for (ChuyenBay chuyenBay : chuyenbays) {
			System.out.println(chuyenBay.toString());
		}
	}

}
