package com.fourward.linkchart.service;

import com.fourward.linkchart.dto.NoticeDTO;

import java.util.Map;
import java.util.List;

public interface INoticeService {

    List<NoticeDTO> getNoticeList() throw Exception;
    void InsertNoticeInfo(NoticeDTO pDTO) throws Exception;

}
