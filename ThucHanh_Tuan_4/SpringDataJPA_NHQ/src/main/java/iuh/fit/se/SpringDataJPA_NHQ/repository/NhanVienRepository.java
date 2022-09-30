package iuh.fit.se.SpringDataJPA_NHQ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {

	// Câu 3: Tìm các nhân viên có lương nhỏ hơn 10,000
	@Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
	public List<NhanVien> getNhanVienWithLuongNhoHon10000();

	// Câu 8: Cho biết tổng số lương phải trả cho các nhân viên
	@Query(value = "select sum(luong) from nhanvien", nativeQuery = true)
	public int getTongLuongTraNhanVien();

	// Câu 9: Cho biết mã số của các phi công lái máy báy Boeing
	@Query(value = "select distinct cn.ma_nv, ten, luong "
			+ "from chungnhan cn join maybay mb on cn.ma_mb = mb.ma_mb "
			+ "join nhanvien nv on cn.ma_nv = nv.ma_nv "
			+ "where mb.loai like 'Boeing%'", nativeQuery = true)
	public List<NhanVien> getPhiCongLaiBoeing();
}
