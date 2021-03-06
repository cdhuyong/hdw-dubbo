package com.hdw.dubbo.search.rpc.api;


import com.hdw.dubbo.common.result.PageInfo;
import com.hdw.dubbo.search.entity.RealData;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 实时数据表 服务类
 * </p>
 *
 * @author TuMinglong
 * @since 2018-03-08
 */
public interface IRealDataService extends IService<RealData> {
	
	void selectDataGrid(PageInfo pageInfo);
}
