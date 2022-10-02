package iuh.fit.se.SpringDataJPA_NHQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.se.SpringDataJPA_NHQ.entity.ChuyenBay;
import iuh.fit.se.SpringDataJPA_NHQ.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	// Cau 1:
	@GetMapping("/Cau1")
	public List<ChuyenBay> findChuyenBayByGaDen() {
		return chuyenBayService.findChuyenBayByGaDen();
	}
	// Cau 4:
	@GetMapping("/Cau4")
	public List<ChuyenBay> findChuyenBayCoDoDaiNhoHon10000VaLonHon8000() {
		return chuyenBayService.findChuyenBayCoDoDaiNhoHon10000VaLonHon8000();
	}
	// Cau 5
	@GetMapping("/Cau5")
	public List<ChuyenBay> findChuyenBayTuSGNdiBMV() {
		return chuyenBayService.findChuyenBayTuSGNdiBMV();
	}
	// Cau 6
	@GetMapping("/Cau6")
	public List<ChuyenBay> findChuyenBayGaDiSGN() {
		return chuyenBayService.findChuyenBayGaDiSGN();
	}
}
