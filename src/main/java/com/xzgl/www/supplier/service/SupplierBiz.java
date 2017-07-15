package com.xzgl.www.supplier.service;

import com.xzgl.www.entity.custom.ReviewedBookVo;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-16.
 */
public interface SupplierBiz {
    public List<ReviewedBookVo> findAllReviewedBook();
}
