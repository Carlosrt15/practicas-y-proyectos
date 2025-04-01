      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. Operaciones-basicas.


       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01  NUM1 PIC 9(4).
       01  NUM2 PIC 9(4).
       01  RESULTADO_suma PIC 9(5).
       01  RESULTADO_resta PIC 9(5).
       01  RESULTADO_mult PIC 9(5).
       01  RESULTADO_div PIC 9(5).
       PROCEDURE DIVISION.
       MAIN-PROCEDURE.

           DISPLAY "Introduce el primer numero:".
           ACCEPT NUM1.
           DISPLAY "Introduce el segundo numero:".
           ACCEPT NUM2.


           ADD NUM1 TO NUM2  GIVING RESULTADO_suma.
           SUBTRACT NUM1 FROM NUM2  GIVING RESULTADO_resta.
           MULTIPLY NUM1 by NUM2  GIVING RESULTADO_mult.
           DIVIDE NUM1 by NUM2  GIVING RESULTADO_div.

           DISPLAY "El resultado de la suma es: " RESULTADO_suma.
           DISPLAY "El resultado de la resta es: " RESULTADO_resta.
        DISPLAY "El resultado de la multiplicacion es: " RESULTADO_mult.
        DISPLAY "El resultado de la division  es: " RESULTADO_div.

       STOP RUN.
       END PROGRAM Operaciones-basicas.
