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
	@Transactional
	public List<ChuyenBay> findChuyenBayByGaDen() {
		List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayByGaDen();
		return chuyenBays;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayCoDoDaiNhoHon10000VaLonHon8000() {
		List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayCoDoDaiNhoHon10000VaLonHon8000();
		return chuyenBays;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayTuSGNdiBMV() {
		List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayTuSGNdiBMV();
		return chuyenBays;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayGaDiSGN() {
		List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayGaDiSGN();
		return chuyenBays;
	}

}
