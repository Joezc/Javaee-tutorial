package com.xzgl.www.college.service;

import com.xzgl.www.entity.Section;
import com.xzgl.www.entity.custom.AddedBookVo;
import com.xzgl.www.entity.custom.ChangedItems;
import com.xzgl.www.entity.custom.OrderBookReviewVo;
import com.xzgl.www.entity.custom.OrderBookVo;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-13.
 */
public interface OrderBookBiz {
    public List<Section> findSelectedSection(String staffId, String year);

    public void add(OrderBookVo orderBookVo);

    public List<AddedBookVo> findAddedBookInfoList(String staffId);

    public void update(ChangedItems changedItems, String staffId);

    public void audit(List<OrderBookReviewVo> orderBookReviewVoList);

    public List<OrderBookReviewVo> findAllNotReviewedBook();
}
