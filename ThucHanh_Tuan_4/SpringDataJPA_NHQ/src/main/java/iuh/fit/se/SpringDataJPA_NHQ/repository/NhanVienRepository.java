package iuh.fit.se.SpringDataJPA_NHQ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String>{
	
	// Câu 3: Tìm các nhân viên có lương nhỏ hơn 10,000
	@Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
	public List<NhanVien> getNhanVienWithLuongNhoHon10000();
	
	// Câu 8: Cho biết tổng số lương phải trả cho các nhân viên
	@Query(value = "select sum(luong) from nhanvien", nativeQuery = true)
	public int getTongLuongTraNhanVien();
}
