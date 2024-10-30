package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanView;


/**
 * 会员
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:47:14
 */
public interface HuiyuanService extends IService<HuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanVO> selectListVO(Wrapper<HuiyuanEntity> wrapper);
   	
   	HuiyuanVO selectVO(@Param("ew") Wrapper<HuiyuanEntity> wrapper);
   	
   	List<HuiyuanView> selectListView(Wrapper<HuiyuanEntity> wrapper);
   	
   	HuiyuanView selectView(@Param("ew") Wrapper<HuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanEntity> wrapper);
   	
}

