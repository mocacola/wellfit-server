package com.mocacola.wellfitserver.welfare.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WelfarePolicyDetailDTO {
    private String policyId; //서비스 id
    private String policyName; //서비스명
    private String jurisdictionMinistryName;  //소관부처명
    private String policySummary; //서비스 요약
    private String tgtrDtlCn; //대상자 상세내용
    private String slctCritCn; // 선정기준 내용
    private String alwServCn; // 급여서비스 내용
    private List<NameAndLink> applmeList; // 서비스 이용 및 신청 방법, 신청방법 이미지 링크
    private List<NameAndLink> inqplCtadList; // 문의처명, 연락처
    private List<NameAndLink> inqplHmpgReldList; // 사이트명, 링크
    private List<NameAndLink> basfrmList; // 서식/자료명, 서식자료링크
    private List<NameAndLink> baslawList; // 근거법령명, 근거법령 링크

    @Builder
    @AllArgsConstructor
    public static class NameAndLink {
        private String servSeCode; // 생애주기 코드
        private String detailName; // 공통 필드 (이름)
        private String detailLink; // 공통 필드 (해당 링크)
    }
}
