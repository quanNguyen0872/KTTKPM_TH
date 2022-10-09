package iuh.fit.se.SpringDataJPA_NHQ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;

@Repository
public interface MayBayRepository extends CrudRepository<MayBay, Integer>{
	
	// Câu 2: Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Query(value = "select * from maybay where tam_bay > 10000", nativeQuery = true)
	public List<MayBay> getMayBayByTamBay();
	
	// Câu 7: Có bao nhiêu loại máy bay Boeing
	@Query(value = "select loai from maybay where loai like 'Boeing%'", nativeQuery = true)
	public List<String> getMayBayByLoaiBoeing();
}
