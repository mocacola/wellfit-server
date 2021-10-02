package com.mocacola.wellfitserver.welfare.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.mocacola.wellfitserver.welfare.dto.WelfarePolicyDetailDTO;
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

	public WelfarePolicyDetailDTO findWelfareDetail(Long policyId){
		List<WelfarePolicyDetailDTO.NameAndLink> applmeList = Collections.singletonList(
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("001")
						.detailName("1.서비스 신청(읍/면/동 주민센터) -> 2.지원자격조사(소득 등)(읍/면/동 주민센터) -> 3.지원대상 결정/통지(시군구) -> 4.서비스제공(서비스제공기관) -> 5.사후관리(여성가족부, 시군구, 서비스제공기관)")
						.detailLink("http://www.bokjiro.go.kr/upload_data/AC/service01/1292412626311.gif")
						.build()
		);
		List<WelfarePolicyDetailDTO.NameAndLink> inqplCtadList = Arrays.asList(
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("005")
						.detailName("아이돌봄 상담대표전화")
						.detailLink("1577-2514")
						.build(),
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("003")
						.detailName("여성가족부 대표전화")
						.detailLink("02-2075-450")
						.build()
		);
		List<WelfarePolicyDetailDTO.NameAndLink> inqplHmpgReldList = Arrays.asList(
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("006")
						.detailName("아이돌봄 지원사업")
						.detailLink("http://idolbom.mogef.go.kr")
						.build(),
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("007")
						.detailName("여성가족부")
						.detailLink("http://www.mogef.go.kr/index.jsp")
						.build()
		);
		List<WelfarePolicyDetailDTO.NameAndLink> basfrmList = Collections.singletonList(
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("008")
						.detailName("2014년_아이돌봄 지원사업 안내 지침.hwp")
						.detailLink("http://www.bokjiro.go.kr/upload_data/AC/service01/WELSVC_201403210911460.hwp")
						.build()
		);
		List<WelfarePolicyDetailDTO.NameAndLink> baslawList = Collections.singletonList(
				WelfarePolicyDetailDTO.NameAndLink.builder()
						.servSeCode("009")
						.detailName("아이돌봄 지원법")
						.detailLink("http://www.law.go.kr/DRF/lawService.do?OC=webmaster&target=law&type=HTML&ID=11537")
						.build()
		);

		return WelfarePolicyDetailDTO.builder()
				.policyId("GEF00000001")
				.policyName("아이돌봄 서비스")
				.tgtrDtlCn("><아동연령 기준, 부모의 취업 등 양육공백, 가구 소득기준을 충족한 경우 정부지원> ▣ 아동연령 기준 ㅇ 시간제 : 생후 3개월 이상 ~ 만 12세 이하 ㅇ 영아종일제 : 모든 소득계층(소득수준에 따라 차등지원)")
				.slctCritCn("ㅇ 시간제 아이돌봄 : 전국가구 평균소득 100% 이하 가정(소득수준에 따라 유형 분류) - 가형(전국가구 평균소득 50% 이하) : 시간당 4,250원 지원 * 가구소득은 건강보험료 본인부담금 고지액을 기준으로 산정 (건강보험 미가입 사입장에 취업한 사람의 소득은 별도 파악)")
				.alwServCn("취업부모 등의 만 12세 이하 자녀의 집으로 아이돌보미가 찾아가 돌봄서비스 제공 - 시간제 : 놀이활동, 보육시설/초등학교 등하원(교) 동행, 식사/간식 챙겨주기 등 - 영아 종일제 : 이유식, 목욕, 위생관리 등")
				.applmeList(applmeList)
				.inqplCtadList(inqplCtadList)
				.inqplHmpgReldList(inqplHmpgReldList)
				.basfrmList(basfrmList)
				.baslawList(baslawList)
				.build();
	}
}
