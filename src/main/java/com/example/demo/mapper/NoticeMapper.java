package com.example.demo.mapper;

import com.example.demo.dtos.NoticeDTO;
import com.example.demo.entity.Notice;
import com.example.demo.vos.notice.NoticeQueryVO;

import java.util.List;

public interface NoticeMapper {

    /**
     * 添加公告（完整的公告信息）
     * @param record 完整的公告信息数据
     * @return 1 表示添加成功； 0 表示添加失败
     */
    int insert(Notice record);


    /**
     * 根据公告编号查询某篇公告
     * @param noticeId 公告编号
     * @return 某篇公告
     */
    Notice selectByPrimaryKey(Integer noticeId);

    /**
     * 分页查询公告
     * @param query 查询条件
     * @return 指定页的公告数据
     */
    List<NoticeDTO> listOfNotice(NoticeQueryVO query);

    /**
     * 查询公告总量
     * @return
     */
    int selectNoticeAmount(NoticeQueryVO queryVO);
    /**
     * 更新公告（选择性更新）
     * @param record 要更新的公告信息数据
     * @return 1 表示更新成功； 0 表示更新失败
     */
    int updateByPrimaryKeySelective(Notice record);

}