package EnteringTest;

public class Main {
    public static void main(String[] args) {
        //Классы и переменные
        Translator translator = new Translator();
        MathOperations calculation = new MathOperations();
        Scan scanner = new Scan();
        String numbers = "0123456789";
        String firstDigitString;
        String secondDigitString;
        String[] inputSplitted;
        int firstDigitInt = 0;
        int secondDigitInt = 0;
        int resultArabian = 0;
        String resultRoman = "";



        //Ввод и чтение
        inputSplitted = scanner.splitter();


        // Определитель чисел(арабские/римские)
        if (numbers.indexOf(inputSplitted[0].charAt(0)) != -1) {

            //Перевод арабских в int
            firstDigitInt = Integer.parseInt(inputSplitted[0]);
            secondDigitInt = Integer.parseInt(inputSplitted[2]);

        } else {

            //Запись римских чисел в переменные для перевода
            firstDigitString = inputSplitted[0];
            secondDigitString = inputSplitted[2];
            //Перевод первого римского числа в int
            firstDigitInt = translator.romanToInt(firstDigitString);
            // Перевод второго римского числа в int
            secondDigitInt = translator.romanToInt(secondDigitString);

        }
        // Исключение
        if(firstDigitInt > 10 || secondDigitInt > 10 )
            throw new NullPointerException("Входящие числа не могут быть больше 10");

        //Операции с числами
        resultArabian =  calculation.MathSwitch(inputSplitted[1],firstDigitInt,secondDigitInt);
        //Переводчик ответа
        if (numbers.indexOf(inputSplitted[0].charAt(0)) != -1) {
            //Вывод ответа на арабском
            System.out.println(resultArabian);
        } else {
            // Перевод ответа с арабского на римский
            resultRoman = translator.ArabicToRoman(resultArabian);
                }
        // Вывод ответа на римском
        System.out.println(resultRoman);
            }
        }

