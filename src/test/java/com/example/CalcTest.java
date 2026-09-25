package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcTest {
    static Calc calc = null;
    @BeforeAll
    static void テスト前処理() {
        calc = new Calc();
    }
    @Test
    void addテスト_正常() {
        assertEquals(calc.add(1, 3), 4);
        assertThat(calc.add(1, 3))
            .as("加算結果の確認")
            .isEqualTo(3);
    }
        @Test
    void subテスト_正常() {
        assertEquals(2, calc.sub(5, 3));
        assertThat(calc.sub(5, 3))
            .as("減算結果の確認")
            .isEqualTo(2);
    }

    @Test
    void multテスト_正常() {
        assertEquals(12, calc.mul(4, 3));
        assertThat(calc.mul(4, 3))
            .as("乗算結果の確認")
            .isEqualTo(12);
    }

    @Test
    void divテスト_正常() {
        assertEquals(3, calc.div(6, 2));
        assertThat(calc.div(6, 2))
            .as("除算結果の確認")
            .isEqualTo(3);
    }

    @AfterAll
    static void テスト後処理() {
        calc = null;
    }
}


 

