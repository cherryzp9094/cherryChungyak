package com.cherryzp.domain.model

/**
 * APT 분양정보 상세조회
 * @param BSNS_MBY_NM 사업주체명(시행사)
 * @param CNSTRCT_ENTRPS_NM 건설업체명(시공사)
 * @param CNTRCT_CNCLS_BGNDE 계약시작일 (YYYY-MM-DD)
 * @param CNTRCT_CNCLS_ENDDE 계약종료일 (YYYY-MM-DD)
 * @param GNRL_RNK1_CRSPAREA_ENDDE 1순위 해당지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK1_CRSPAREA_RCPTDE 1순위 해당지역 접수시작일 (YYYY-MM-DD)
 * @param GNRL_RNK1_ETC_AREA_ENDDE 1순위 기타지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK1_ETC_AREA_RCPTDE 1순위 기타지역 접수시작일 (YYYY-MM-DD)
 * @param GNRL_RNK1_ETC_GG_ENDDE 1순위 경기지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK1_ETC_GG_RCPTDE 1순위 경기지역 접수시작일 (YYYY-MM-DD)
 * @param GNRL_RNK2_CRSPAREA_ENDDE 2순위 해당지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK2_CRSPAREA_RCPTDE 2순위 해당지역 접수시작일 (YYYY-MM-DD)
 * @param GNRL_RNK2_ETC_AREA_ENDDE 2순위 기타지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK2_ETC_AREA_RCPTDE 2순위 기타지역 접수시작일 (YYYY-MM-DD)
 * @param GNRL_RNK2_ETC_GG_ENDDE 2순위 경기지역 접수종료일 (YYYY-MM-DD)
 * @param GNRL_RNK2_ETC_GG_RCPTDE 2순위 경기지역 접수시작일 (YYYY-MM-DD)
 * @param HMPG_ADRES 홈페이지주소
 * @param HOUSE_DTL_SECD 주택상세구분코드(01: 민영, 03: 국민)
 * @param HOUSE_DTL_SECD_NM 주택상세구분코드명
 * @param HOUSE_MANAGE_NO 주택관리번호
 * @param HOUSE_NM 주택명
 * @param HOUSE_SECD 주택구분코드 (01: APT, 09: 민간사전청약, 10: 신혼희망타운 )
 * @param HOUSE_SECD_NM 주택구분코드명
 * @param HSSPLY_ADRES 공급위치
 * @param HSSPLY_ZIP 공급위치 우편번호
 * @param IMPRMN_BSNS_AT 정비사업
 * @param LRSCL_BLDLND_AT 대규모 택지개발지구
 * @param MDAT_TRGET_AREA_SECD 조정대상지역 (Y: 과열지역, N: 미대상주택)
 * @param MDHS_TELNO 문의처
 * @param MVN_PREARNGE_YM 입주예정월
 * @param NPLN_PRVOPR_PUBLIC_HOUSE_AT 수도권 내 민영 공공주택지구
 * @param PARCPRC_ULS_AT 분양가상한제
 * @param PBLANC_NO 공고번호
 * @param PBLANC_URL 분양정보 URL
 * @param PRZWNER_PRESNATN_DE 당첨자발표일 (YYYY-MM-DD)
 * @param PUBLIC_HOUSE_EARTH_AT 공공주택지구
 * @param PUBLIC_HOUSE_SPCLW_APPLC_AT 공공주택 특별법 적용 여부
 * @param RCEPT_BGNDE 청약접수시작일 (YYYY-MM-DD)
 * @param RCEPT_ENDDE 청약접수종료일 (YYYY-MM-DD)
 * @param RCRIT_PBLANC_DE 모집공고일 (YYYY-MM-DD)
 * @param RENT_SECD 분양구분코드(0: 분양주택, 1: 분양전환 가능임대)
 * @param RENT_SECD_NM 분양구분코드명
 * @param SPECLT_RDN_EARTH_AT 투기과열지구
 * @param SPSPLY_RCEPT_BGNDE 특별공급 접수시작일 (YYYY-MM-DD)
 * @param SPSPLY_RCEPT_ENDDE 특별공급 접수종료일 (YYYY-MM-DD)
 * @param SUBSCRPT_AREA_CODE 공급지역코드
 * @param SUBSCRPT_AREA_CODE_NM 공급지역명
 * @param TOT_SUPLY_HSHLDCO 공급규모
 */
data class HomeAptInfoDetail(
    val BSNS_MBY_NM: String?,
    val CNSTRCT_ENTRPS_NM: String?,
    val CNTRCT_CNCLS_BGNDE: String?,
    val CNTRCT_CNCLS_ENDDE: String?,
    val GNRL_RNK1_CRSPAREA_ENDDE: String?,
    val GNRL_RNK1_CRSPAREA_RCPTDE: String?,
    val GNRL_RNK1_ETC_AREA_ENDDE: String?,
    val GNRL_RNK1_ETC_AREA_RCPTDE: String?,
    val GNRL_RNK1_ETC_GG_ENDDE: String?,
    val GNRL_RNK1_ETC_GG_RCPTDE: String?,
    val GNRL_RNK2_CRSPAREA_ENDDE: String?,
    val GNRL_RNK2_CRSPAREA_RCPTDE: String?,
    val GNRL_RNK2_ETC_AREA_ENDDE: String?,
    val GNRL_RNK2_ETC_AREA_RCPTDE: String?,
    val GNRL_RNK2_ETC_GG_ENDDE: String?,
    val GNRL_RNK2_ETC_GG_RCPTDE: String?,
    val HMPG_ADRES: String?,
    val HOUSE_DTL_SECD: String?,
    val HOUSE_DTL_SECD_NM: String?,
    val HOUSE_MANAGE_NO: String?,
    val HOUSE_NM: String?,
    val HOUSE_SECD: String?,
    val HOUSE_SECD_NM: String?,
    val HSSPLY_ADRES: String?,
    val HSSPLY_ZIP: String?,
    val IMPRMN_BSNS_AT: String?,
    val LRSCL_BLDLND_AT: String?,
    val MDAT_TRGET_AREA_SECD: String?,
    val MDHS_TELNO: String?,
    val MVN_PREARNGE_YM: String?,
    val NPLN_PRVOPR_PUBLIC_HOUSE_AT: String?,
    val PARCPRC_ULS_AT: String?,
    val PBLANC_NO: String?,
    val PBLANC_URL: String?,
    val PRZWNER_PRESNATN_DE: String?,
    val PUBLIC_HOUSE_EARTH_AT: String?,
    val PUBLIC_HOUSE_SPCLW_APPLC_AT: String?,
    val RCEPT_BGNDE: String?,
    val RCEPT_ENDDE: String?,
    val RCRIT_PBLANC_DE: String?,
    val RENT_SECD: String?,
    val RENT_SECD_NM: String?,
    val SPECLT_RDN_EARTH_AT: String?,
    val SPSPLY_RCEPT_BGNDE: String?,
    val SPSPLY_RCEPT_ENDDE: String?,
    val SUBSCRPT_AREA_CODE: String?,
    val SUBSCRPT_AREA_CODE_NM: String?,
    val TOT_SUPLY_HSHLDCO: Int?
)
