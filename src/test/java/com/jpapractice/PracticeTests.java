package com.jpapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class PracticeTests {

    private static Stream<Arguments> newPhone(){
        return Stream.of(
                Arguments.of(1,
                        "galaxy23",
                        "samsung",
                        1155000,
                        LocalDate.of(2021, 9, 15),
                        6.1,
                        "ANDROID",
                        3900
                        ),
                Arguments.of(2,
                        "iphone13",
                        "apple",
                        1078000,
                        LocalDate.of(2023, 2, 17),
                        6.1,
                        "IOS",
                        3227
                        )
        );
    }

    @DisplayName("테이블 만들기 테스트")
    @ParameterizedTest
    @MethodSource("createMember")
    void testCreateTable(int productNo, String productName, String manufacturer, int price, LocalDate releaseDate, double screenSize,
                         OperatingSys operatingSys, int battery){
        ProductRegistDTO productInfo = new ProductRegistDTO(
                productName,
                manufacturer,
                price,
                releaseDate,
                screenSize,
                operatingSys,
                battery
        );
    }

}
