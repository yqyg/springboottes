package com.jy.mapper;

import com.jy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    User selectpp(Long id);

    List<String> getsubjectbyterm();

    List<String> selectbyparam(String majorid);
}
