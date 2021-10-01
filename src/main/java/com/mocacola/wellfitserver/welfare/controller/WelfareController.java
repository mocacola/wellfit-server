package com.mocacola.wellfitserver.welfare.controller;

import com.mocacola.wellfitserver.welfare.dto.WelfarePolicyDetailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mocacola.wellfitserver.welfare.dto.WelfarePolicyListDto;
import com.mocacola.wellfitserver.welfare.service.WebClientService;
import lombok.RequiredArgsConstructor;

@RequestMapping("/api/v1/welfare")
@RequiredArgsConstructor
@RestController
public class WelfareController {

	private final WebClientService webClientService;

	@GetMapping
	public ResponseEntity<WelfarePolicyListDto> findAllWelfarePolicies() {
		return ResponseEntity.ok(webClientService.findAllWelfarePolicies());
	}

	@GetMapping("{policyId}")
	public ResponseEntity<WelfarePolicyDetailDTO> findWelfareDetail(@PathVariable Long policyId){
		return ResponseEntity.ok(webClientService.findWelfareDetail(policyId));
	}
}
