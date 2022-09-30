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
	
}
