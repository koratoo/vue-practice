package com.project.mapper;

import com.project.domain.DTO.Search.MemberSearch;
import com.project.domain.VO.MemberVO;
import lombok.Builder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("Select name from member")
    public List<String> getMemberName();


    @Select("SELECT " +
            "name, " +
            "gender, " +
            "skillLevel, " +
            "joinDate, " +
            "exitDate " +
            "FROM " +
            "MEMBER " +
            "WHERE " +
            "name LIKE '%'|| #{name} ||'%' " +
            "AND gender LIKE '%'|| #{gender} ||'%' " +
            "AND skillLevel LIKE '%'|| #{skillLevel} ||'%' " +
            "AND joinDate >= #{joinDate} " +
            "AND #{exitDate} >= exitDate ")
    public List<MemberSearch> searchMember(MemberSearch memberSearch);
}
