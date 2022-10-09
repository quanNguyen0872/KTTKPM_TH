package iuh.fit.se.SpringDataJPA_NHQ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.se.SpringDataJPA_NHQ.entity.MayBay;
import iuh.fit.se.SpringDataJPA_NHQ.service.MayBayService;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
	
	@Autowired
	private MayBayService mayBayService;
	
	// Cau 2:
	@GetMapping("/Cau2")
	public List<MayBay> getMayBayByTamBay() {
		return mayBayService.getMayBayByTamBay();
	}
	// Cau 7:
	@GetMapping("/Cau7")
	public List<String> getMayBayByLoaiBoeing() {
		return mayBayService.getMayBayByLoaiBoeing();
	}
}
