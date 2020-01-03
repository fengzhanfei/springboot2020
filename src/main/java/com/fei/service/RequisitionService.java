package com.fei.service;

import com.fei.dto.RequisitionDTO;

import java.util.Map;

/**
 * @author fengzf fengzf@gstarcad.com
 * @version Vxxx (项目版本)
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:  根据购买属性创建调拨
 * @date 2020/1/3 16:06
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2020/1/3 16:06
 */
public interface RequisitionService {

    /**
     *创建调拨，返回调拨id，调拨编号
     * @return
     */
    Map<String,String> createRequisition(RequisitionDTO requisitionDTO);
}
