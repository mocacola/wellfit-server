package com.mocacola.wellfitserver.welfare.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class WelfarePolicyDto {
	private Long policyId; //서비스 id
	private String policyName; //서비스명
	private String jurisdictionMinistryName;  //소관부처명
	private String jurisdictionOrganizationName; //소관조직명
	private Integer viewCount; //조회수
	private String policySummary; //서비스 요약
	private String policyDetailLink; //서비스 상세 링크
	private LocalDateTime createdAt; //서비스 등록일

}
