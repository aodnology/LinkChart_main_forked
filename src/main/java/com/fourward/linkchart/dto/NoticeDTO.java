package com.fourward.linkchart.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
// 공지사항 글 하나의 정보
/*
VO (Value Object)
: read-only , 사용하는 도중에 변경 불가능하며 오직 읽기만 가능
공지사항의 특성상 vo를 사용
* */
public class NoticeVO {
    private int NOTICE_NUM;
    private String NOTICE_NAME;
    private String NOTICE_PASS;
    private String NOTICE_SUBJECT;
    private String NOTICE_CONTENT;
    private String NOTICE_FILE;
    private int NOTICE_RE_REF;
    private int NOTICE_RE_LEV;
    private int NOTICE_RE_SEQ;
    private int NOTICE_READCOUNT;
    private Date NOTICE_DATE;
}
