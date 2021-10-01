package com.mocacola.wellfitserver.welfare.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class WelfarePolicyListDto {
	private Integer numOfRows; //한 페이지 결과 수
	private Integer pageNum; //페이지 번호
	private Long totalCount; //전체 데이터 수
	private List<WelfarePolicyDto> serviceList; //복지 정책 리스트

}
