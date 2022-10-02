package iuh.fit.se.SpringDataJPA_NHQ.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;
import iuh.fit.se.SpringDataJPA_NHQ.repository.MayBayRepository;
import iuh.fit.se.SpringDataJPA_NHQ.service.MayBayService;

@Service
public class MayBayServiceImpl implements MayBayService{
	
	private MayBayRepository mayBayRepository;
	
	@Autowired
	public MayBayServiceImpl(MayBayRepository mayBayRepository) {
		super();
		this.mayBayRepository = mayBayRepository;
	}

	@Override
	@Transactional
	public List<MayBay> getMayBayByTamBay() {
		return mayBayRepository.getMayBayByTamBay();
	}

	@Override
	@Transactional
	public List<String> getMayBayByLoaiBoeing() {
		return mayBayRepository.getMayBayByLoaiBoeing();
	}

}
