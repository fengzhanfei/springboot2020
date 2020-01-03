package com.fei.service.impl;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2020/1/3 16:14
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2020/1/3 16:14
 */

import com.fei.dto.RequisitionDTO;
import com.fei.service.RequisitionService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName: CreateLicenseImpl.java
 * @Description:  购买属性：创建授权创建调拨
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2020/1/3 16:14
 *
 */
@Service("createLicenseService")
public class CreateLicenseServiceImpl implements RequisitionService {
    /**
     *创建调拨，返回调拨id，调拨编号
     * @return
     */
    @Override
    public Map<String, String> createRequisition(RequisitionDTO requisitionDTO) {
        return null;
    }
}
