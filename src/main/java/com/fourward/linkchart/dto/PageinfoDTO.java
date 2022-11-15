package com.fourward.linkchart.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageinfoVO {
    private int page;
    private int maxPage;
    private int startPage;
    private int endPage;
    private int listCount;
}
