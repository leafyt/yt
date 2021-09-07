package com.yt.mapper;

import com.yt.entity.Trole;
import com.yt.util.MyMapper;

import java.util.List;

public interface TroleMapper extends MyMapper<Trole> {

    List<Trole> selectRolesByUserId(Integer userid);

}