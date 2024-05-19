package com.cherryzp.data.mapper

import com.cherryzp.data.model.HomeAptInfoDetailEntity
import com.cherryzp.domain.model.HomeAptInfoDetail

fun HomeAptInfoDetailEntity?.toDomain(): HomeAptInfoDetail =
    HomeAptInfoDetail(
        BSNS_MBY_NM = this?.BSNS_MBY_NM,
        CNSTRCT_ENTRPS_NM = this?.CNSTRCT_ENTRPS_NM,
        CNTRCT_CNCLS_BGNDE = this?.CNTRCT_CNCLS_BGNDE,
        CNTRCT_CNCLS_ENDDE = this?.CNTRCT_CNCLS_ENDDE,
        GNRL_RNK1_CRSPAREA_ENDDE = this?.GNRL_RNK1_CRSPAREA_ENDDE,
        GNRL_RNK1_CRSPAREA_RCPTDE = this?.GNRL_RNK1_CRSPAREA_RCPTDE,
        GNRL_RNK1_ETC_AREA_ENDDE = this?.GNRL_RNK1_ETC_AREA_ENDDE,
        GNRL_RNK1_ETC_AREA_RCPTDE = this?.GNRL_RNK1_ETC_AREA_RCPTDE,
        GNRL_RNK1_ETC_GG_ENDDE = this?.GNRL_RNK1_ETC_GG_ENDDE,
        GNRL_RNK1_ETC_GG_RCPTDE = this?.GNRL_RNK1_ETC_GG_RCPTDE,
        GNRL_RNK2_CRSPAREA_ENDDE = this?.GNRL_RNK2_CRSPAREA_ENDDE,
        GNRL_RNK2_CRSPAREA_RCPTDE = this?.GNRL_RNK2_CRSPAREA_RCPTDE,
        GNRL_RNK2_ETC_AREA_ENDDE = this?.GNRL_RNK2_ETC_AREA_ENDDE,
        GNRL_RNK2_ETC_AREA_RCPTDE = this?.GNRL_RNK2_ETC_AREA_RCPTDE,
        GNRL_RNK2_ETC_GG_ENDDE = this?.GNRL_RNK2_ETC_GG_ENDDE,
        GNRL_RNK2_ETC_GG_RCPTDE = this?.GNRL_RNK2_ETC_GG_RCPTDE,
        HMPG_ADRES = this?.HMPG_ADRES,
        HOUSE_DTL_SECD = this?.HOUSE_DTL_SECD,
        HOUSE_DTL_SECD_NM = this?.HOUSE_DTL_SECD_NM,
        HOUSE_MANAGE_NO = this?.HOUSE_MANAGE_NO,
        HOUSE_NM = this?.HOUSE_NM,
        HOUSE_SECD = this?.HOUSE_SECD,
        HOUSE_SECD_NM = this?.HOUSE_SECD_NM,
        HSSPLY_ADRES = this?.HSSPLY_ADRES,
        HSSPLY_ZIP = this?.HSSPLY_ZIP,
        IMPRMN_BSNS_AT = this?.IMPRMN_BSNS_AT,
        LRSCL_BLDLND_AT = this?.LRSCL_BLDLND_AT,
        MDAT_TRGET_AREA_SECD = this?.MDAT_TRGET_AREA_SECD,
        MDHS_TELNO = this?.MDHS_TELNO,
        MVN_PREARNGE_YM = this?.MVN_PREARNGE_YM,
        NPLN_PRVOPR_PUBLIC_HOUSE_AT = this?.NPLN_PRVOPR_PUBLIC_HOUSE_AT,
        PARCPRC_ULS_AT = this?.PARCPRC_ULS_AT,
        PBLANC_NO = this?.PBLANC_NO,
        PBLANC_URL = this?.PBLANC_URL,
        PRZWNER_PRESNATN_DE = this?.PRZWNER_PRESNATN_DE,
        PUBLIC_HOUSE_EARTH_AT = this?.PUBLIC_HOUSE_EARTH_AT,
        PUBLIC_HOUSE_SPCLW_APPLC_AT = this?.PUBLIC_HOUSE_SPCLW_APPLC_AT,
        RCEPT_BGNDE = this?.RCEPT_BGNDE,
        RCEPT_ENDDE = this?.RCEPT_ENDDE,
        RCRIT_PBLANC_DE = this?.RCRIT_PBLANC_DE,
        RENT_SECD = this?.RENT_SECD,
        RENT_SECD_NM = this?.RENT_SECD_NM,
        SPECLT_RDN_EARTH_AT = this?.SPECLT_RDN_EARTH_AT,
        SPSPLY_RCEPT_BGNDE = this?.SPSPLY_RCEPT_BGNDE,
        SPSPLY_RCEPT_ENDDE = this?.SPSPLY_RCEPT_ENDDE,
        SUBSCRPT_AREA_CODE = this?.SUBSCRPT_AREA_CODE,
        SUBSCRPT_AREA_CODE_NM = this?.SUBSCRPT_AREA_CODE_NM,
        TOT_SUPLY_HSHLDCO = this?.TOT_SUPLY_HSHLDCO
    )
