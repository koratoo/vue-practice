package com.project.service;

import com.project.domain.DTO.Search.MemberSearch;
import com.project.domain.VO.MemberVO;
import com.project.exception.CalendarException;
import com.project.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<String> getMemberName() {

        return memberMapper.getMemberName();
    }

    public List<MemberSearch> searchMember(MemberSearch memberSearch) {
        String joinDate = memberSearch.getJoinDate();
        String exitDate = memberSearch.getExitDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // joinDate 유효성 검증
            LocalDate.parse(joinDate, formatter);
        } catch (DateTimeParseException e) {
            throw new CalendarException("joinDate가 올바른 형식이 아닙니다. YYYY-MM-DD 형식으로 작성해 주세요.");
        }

        try {
            // exitDate 유효성 검증
            LocalDate.parse(exitDate, formatter);
        } catch (DateTimeParseException e) {
            throw new CalendarException("exitDate가 올바른 형식이 아닙니다. YYYY-MM-DD 형식으로 작성해 주세요.");
        }

        return memberMapper.searchMember(memberSearch);
    }

}
