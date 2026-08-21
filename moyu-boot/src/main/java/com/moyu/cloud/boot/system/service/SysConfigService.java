package com.moyu.cloud.boot.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moyu.cloud.boot.system.model.entity.SysConfig;
import com.moyu.cloud.boot.system.model.param.SysConfigParam;
import com.moyu.cloud.boot.system.model.vo.SysConfigVO;
import com.moyu.cloud.common.core.model.PageData;

import java.util.List;

/**
 * 系统配置服务类Service
 *
 * @author moyusisi
 * @since 2026-05-28
 */
public interface SysConfigService extends IService<SysConfig> {

    /**
     * 获取记录列表(不分页，通过条件自行控制数量)
     */
    List<SysConfigVO> list(SysConfigParam param);

    /**
     * 分页获取记录列表
     */
    PageData<SysConfigVO> pageList(SysConfigParam param);

    /**
     * 获取记录详情(通过主键或唯一键)
     */
    SysConfigVO detail(SysConfigParam param);

    /**
     * 添加记录
     */
    void add(SysConfigParam param);

    /**
     * 修改记录(通过主键id更新)
     */
    void update(SysConfigParam param);

    /**
     * 通过ids删除记录
     */
    void deleteByIds(SysConfigParam param);

    /**
     * 刷新系统配置缓存
     */
    void refreshCache();

    /**
     * 通过key获取对应的value(仅查缓存)
     */
    String getCacheValue(String configKey);

}
