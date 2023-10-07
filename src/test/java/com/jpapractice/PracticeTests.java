package com.jpapractice;

import org.junit.jupiter.params.provider.Arguments;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class PracticeTests {

    private static Stream<Arguments> newPhone(){
        return Stream.of(
                Arguments.of(1,
                        "galaxy23",
                        "samsung",
                        1155000,
                        ,
                        6.1,
                        "ANDROID",
                        3900
                        ),
                Arguments.of(2,
                        "iphone13",
                        "apple",
                        1078000,

                        )
        );
    }
}
