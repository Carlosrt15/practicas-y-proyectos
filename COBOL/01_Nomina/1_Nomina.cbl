      ******************************************************************
      * Author:
      * Date:
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. 01_nomina.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 NUMERO1 PIC 9(3).
       01 NUMERO2 PIC 9(3).
       01 RESULTADO PIC 9(4).
       PROCEDURE DIVISION.
       DISPLAY "Introduce el primer numero".
       ACCEPT NUMERO1.

       DISPLAY "Introduce el segundo numero".
       ACCEPT NUMERO2.

       ADD NUMERO1 TO NUMERO2 GIVING RESULTADO.
       DISPLAY "El resultado de de la suma es:" RESULTADO.


            STOP RUN.
       END PROGRAM 01_nomina.
