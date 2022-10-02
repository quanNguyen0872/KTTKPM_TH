package iuh.fit.se.SpringDataJPA_NHQ.service;

import java.util.List;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;

public interface ChuyenBayService {
	// Câu 1:
	public List<ChuyenBay> findChuyenBayByGaDen();
	// Câu 4:
	public List<ChuyenBay> findChuyenBayCoDoDaiNhoHon10000VaLonHon8000();
	// Câu 5:
	public List<ChuyenBay> findChuyenBayTuSGNdiBMV();
	// Câu 6:
	public List<ChuyenBay> findChuyenBayGaDiSGN();
}
