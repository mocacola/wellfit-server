package com.mocacola.wellfitserver.welfare.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
