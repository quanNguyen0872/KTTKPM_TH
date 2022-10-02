package iuh.fit.se.SpringDataJPA_NHQ.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;
import iuh.fit.se.SpringDataJPA_NHQ.repository.ChuyenBayRepository;
import iuh.fit.se.SpringDataJPA_NHQ.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
	
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	public ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository) {
		this.chuyenBayRepository = chuyenBayRepository;
	}

	@Override
	public List<ChuyenBay> findChuyenBayByGaDen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayCoDoDaiNhoHon10000VaLonHon8000() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChuyenBay> findChuyenBayTuSGNdiBMV() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChuyenBay> findChuyenBayGaDiSGN() {
		// TODO Auto-generated method stub
		return null;
	}

}
