package com.project.service;

import com.project.domain.DTO.Search.MemberSearch;
import com.project.domain.VO.MemberVO;
import com.project.exception.CalendarException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootTest
@AutoConfigureMockMvc
class MemberServiceImplTest {

    @Autowired
    private MemberService service;

    @Test
    @DisplayName("검색요청 응답확인 테스트")
    public void searchMemberTest() throws Exception{
        //given
        MemberSearch dto = MemberSearch
                .builder()
                .name("")
                .gender("100")
                .skillLevel("100")
                .joinDate("2021-01-01")
                .exitDate("2026-01-01")
                .build();

        //when
        List<MemberSearch> result = service.searchMember(dto);

        //then
        // 이름을 기준으로 오름차순 정렬
        List<MemberSearch> sortedResult = result.stream()
                .sorted(Comparator.comparing(MemberSearch::getName))
                .collect(Collectors.toList());

        // 정렬된 결과 출력
        sortedResult.forEach(System.out::println);

    }


    @Test
    @DisplayName("Calendar Exception 예외처리 테스트")
    public void searchMemberCalendarExceptionTest() throws Exception {
        //given
        MemberSearch dto = MemberSearch
                .builder()
                .name("")
                .gender("100")
                .skillLevel("100")
                .joinDate("202101-01")
                .exitDate("202601-01")
                .build();

        //when & then
        CalendarException exception = Assertions.assertThrows(CalendarException.class, () -> {
            service.searchMember(dto);
        });

        String expectedMessage = "joinDate가 올바른 형식이 아니다. YYYY-MM-DD 형식으로 작성해 주세요.";
        Assertions.assertEquals(expectedMessage, exception.getMessage());
    }
}
