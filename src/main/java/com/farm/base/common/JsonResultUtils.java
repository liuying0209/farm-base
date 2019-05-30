package com.farm.base.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回页面封装参数的工具类
 *
 */
public class JsonResultUtils {

    /**
     * 处理 分页查询方法返回参数
     */

    public static JsonResult getResultByPage(Page page) {
        Map<String, Object> resultData = new HashMap<String, Object>();

        //保证rest接口中list为空返回空数组
        if (page.getData() == null) {
            List<Object> obj = new ArrayList<>();
            resultData.put("list", obj);
        } else {
            resultData.put("list", page.getData());
        }
        resultData.put("total", page.getTotalCount());

        JsonResult result = JsonResult.ok();
        result.setData(resultData);
        return result;
    }
}
