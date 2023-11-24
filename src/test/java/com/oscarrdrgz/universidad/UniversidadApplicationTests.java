package com.oscarrdrgz.universidad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UniversidadApplicationTests {
    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Suma de valorA y valorB")
    void sumaDeValores(){
        //given
        int valorA=3;
        int valorB=5;

        //when
        int expectativa = calculadora.sumar(valorA,valorB);


        //then
        int resultadoEsperado= 8;
        assertThat(expectativa).isEqualTo(resultadoEsperado);
    }



    class Calculadora{
        int sumar(int valor_a, int valor_b){
            return valor_a+valor_b;
        }
    }

}
