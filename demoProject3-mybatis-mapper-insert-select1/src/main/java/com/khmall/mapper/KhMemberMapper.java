package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.khmall.dto.KhMembers;

@Mapper
public interface KhMemberMapper {
	void insertKhMembers(KhMembers khMembers);
}
