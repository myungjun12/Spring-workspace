package com.kh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.dto.Fuck;

@Mapper
public interface FuckMapper {
	void FuckInsert(Fuck fuck);
}
