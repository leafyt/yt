package com.yt.mapper;

import com.yt.entity.Tmenu;
import com.yt.util.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface TmenuMapper extends MyMapper<Tmenu> {

    List<Tmenu> selectMenusByRoleId(Integer roleid);

    List<Tmenu> selectByParentIdAndRoleId(HashMap<String,Object> paraMap);

}