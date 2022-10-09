package iuh.fit.se.SpringDataJPA_NHQ.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.se.SpringDataJPA_NHQ.entity.NhanVien;
import iuh.fit.se.SpringDataJPA_NHQ.repository.NhanVienRepository;
import iuh.fit.se.SpringDataJPA_NHQ.service.NhanVienService;

@Service
public class NhanVienServiceImpl implements NhanVienService{
	
	private NhanVienRepository nhanVienRepository;
	
	@Autowired
	public NhanVienServiceImpl(NhanVienRepository nhanVienRepository) {
		super();
		this.nhanVienRepository = nhanVienRepository;
	}

	@Override
	@Transactional
	public List<NhanVien> getNhanVienWithLuongNhoHon10000() {
		return nhanVienRepository.getNhanVienWithLuongNhoHon10000();
	}

	@Override
	@Transactional
	public int getTongLuongTraNhanVien() {
		return nhanVienRepository.getTongLuongTraNhanVien();
	}

	@Override
	@Transactional
	public List<NhanVien> getPhiCongLaiBoeing() {
		return nhanVienRepository.getPhiCongLaiBoeing();
	}

}
