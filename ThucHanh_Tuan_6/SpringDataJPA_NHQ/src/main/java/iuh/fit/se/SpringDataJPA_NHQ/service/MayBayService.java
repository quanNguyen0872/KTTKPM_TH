package iuh.fit.se.SpringDataJPA_NHQ.service;

import java.util.List;

import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;

public interface MayBayService {
	// Câu 2:
	public List<MayBay> getMayBayByTamBay();
	// Câu 7:
	public List<String> getMayBayByLoaiBoeing();
}
