package com.fourward.linkchart.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping(value="/notice")
@Controller
public class NoticeController {

    @GetMapping(value = "/noticeInfo")
    public String NoticePage() throws Exception {
        log.info(this.getClass().getName() + "Notice start");
        log.info(this.getClass().getName() + "Notice End");

        //views noticeInfo.jsp 호출
        return "/notice/noticeInfo";
    }
}
