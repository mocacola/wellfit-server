package com.mocacola.wellfitserver.welfare.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mocacola.wellfitserver.welfare.dto.WelfarePolicyDto;
import com.mocacola.wellfitserver.welfare.dto.WelfarePolicyListDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WebClientService {

	public WelfarePolicyListDto findAllWelfarePolicies() {
		List<WelfarePolicyDto> welfarePolicies = Arrays.asList(
			WelfarePolicyDto.builder()
				.policyId(1L)
				.policyName("다문화가족 자녀 언어발달 지원 서비스")
				.jurisdictionMinistryName("소관부처명1")
				.jurisdictionOrganizationName("소관조직명1")
				.viewCount(10984)
				.policySummary("다문화가족의 자녀가 건강한 사회구성원으로 성장할 수 있도록 언어발달 지원 서비스를 제공합니다.")
				.policyDetailLink("https://www.bokjiro.go.kr/ssis-teu/twataa/wlfareInfo/moveTWAT52011M.do")
				.createdAt(LocalDateTime.of(2021, 9, 30, 12, 10, 43))
				.build(),
			WelfarePolicyDto.builder()
				.policyId(2L)
				.policyName("국가 보훈 대상자 취업 능력 개발 지원")
				.jurisdictionMinistryName("소관부처명2")
				.jurisdictionOrganizationName("소관조직명2")
				.viewCount(2854)
				.policySummary("보훈대상자의 취업 경쟁력을 높이기 위한 서비스입니다.")
				.policyDetailLink("https://www.bokjiro.go.kr/ssis-teu/twataa/wlfareInfo/moveTWAT52011M.do")
				.createdAt(LocalDateTime.of(2020, 10, 4, 18, 13, 3))
				.build()
		);
		return WelfarePolicyListDto.builder()
			.pageNum(0)
			.numOfRows(2)
			.totalCount(2L)
			.serviceList(welfarePolicies)
			.build();
	}
}
