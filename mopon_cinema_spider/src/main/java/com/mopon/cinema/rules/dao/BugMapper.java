package com.mopon.cinema.rules.dao;

import org.apache.ibatis.annotations.Param;

import com.mopon.cinema.domain.Bug;

public interface BugMapper {

   int getInsert(Bug record);

}