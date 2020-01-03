package com.fei.factory;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2020/1/3 17:00
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2020/1/3 17:00
 */

import com.fei.dto.RequisitionDTO;
import com.fei.service.RequisitionService;
import com.fei.service.impl.ChangeLicenseServiceImpl;
import com.fei.service.impl.CreateLicenseServiceImpl;
import com.fei.service.impl.UpgradeLicenseServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FactoryForRequisition.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2020/1/3 17:00
 *
 */
public class FactoryForRequisition {

    static Map<String,RequisitionService> serviceMap = new HashMap<>();

    static {
        serviceMap.put("",new CreateLicenseServiceImpl());
        serviceMap.put("",new UpgradeLicenseServiceImpl());
        serviceMap.put("",new ChangeLicenseServiceImpl());
    }

    public RequisitionService getService(RequisitionDTO requisitionDTO) throws Exception{
        RequisitionService service = serviceMap.get("");
        if(service == null) {
            throw new RuntimeException("no strategy defined");
        }
        return service;
    }
}
