package com.yt.service.impl;

import com.yt.entity.Tmenu;
import com.yt.mapper.TmenuMapper;
import com.yt.service.TmenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @description
 */
@Service("tmenuService")
public class TmenuServieImpl extends BaseService<Tmenu> implements TmenuService {
    @Autowired
    private TmenuMapper tmenuMapper;

    @Override
    public List<Tmenu> selectMenusByRoleId(Integer roleid) {
        return tmenuMapper.selectMenusByRoleId(roleid);
    }

    @Override
    public List<Tmenu> selectByParentIdAndRoleId(HashMap<String, Object> paraMap) {
        return tmenuMapper.selectByParentIdAndRoleId(paraMap);
    }
}
