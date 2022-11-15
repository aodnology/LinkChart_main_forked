package com.fourward.linkchart.service.impl;

import com.fourward.linkchart.dto.NoticeDTO;
import com.fourward.linkchart.persistence.mapper.INoticeMapper;
import com.fourward.linkchart.service.INoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j                    // Logback
@RequiredArgsConstructor  // final 선언된 상수에 대한 생성자 만들기
@Service("NoticeService") // service 선언
public class NoticeService implements INoticeService {
    private final INoticeMapper noticeMapper;  // noticeMapper 변수에 이미 메모리에 올라간 Mapper 객체 주입

    @Override
    public List<NoticeDTO> InsertNoticeList() throws Exception {
        log.info(this.getClass().getName() + "getNoticeList 시작");
        return noticeMapper.InsertNoticeInfo();
    }

    @Transactional // 데이터의 변화가 발생하는 경우 설정
    @Override
    public void getNoticeInfo(NoticeDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + "InsertNoticeInfo 시작");

        // 상세보기 할때마다, 조회수 증가
        log.info("Update ReadCNT");
        noticeMapper.updateNoticeReadCnt(pDTO);

        return noticeMapper.getNoticeInfo(pDTO);
    }
}
