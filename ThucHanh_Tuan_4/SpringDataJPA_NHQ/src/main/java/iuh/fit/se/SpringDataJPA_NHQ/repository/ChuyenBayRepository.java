package iuh.fit.se.SpringDataJPA_NHQ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String>{
	
	// Câu 1: Cho biết các chuyến bay đi Đà Lạt (DAD).
	@Query(value = "select * from chuyenbay where ga_den = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBayByGaDen();
	
	// Câu 4: Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@Query(value = "select * from chuyenbay where do_dai > 8000 and do_dai < 10000", nativeQuery = true)
	public List<ChuyenBay> findChuyenBayCoDoDaiNhoHon10000VaLonHon8000();
	
	// Câu 5: Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Query(value = "select * from chuyenbay where ga_di = 'SGN' and ga_den = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBayTuSGNdiBMV();
	
}
