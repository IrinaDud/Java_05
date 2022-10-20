public class FizzBuzz {                                   //fizz число делися на  3. деление на 5 . Вместе 15
    public String[] fizzBuzz(int start, int end) {        //метод называют так,как называется алгоритм

        if (start <= end) {                               //проверка не пустой ли массив
        String[] array = new String[end - start + 1];     //формула для вычисления длины массива

            int number = start;

            for(int i = 0;i < array.length && number <= end;i ++) {
                if( number % 15 == 0) {
                    array[i] = "FizzBuzz";
                } else if(number % 3 == 0) {
                    array[i] = "Fizz";
                } else if (number % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);
                }
                number ++;
            }
            return array;
        }

        return new String[0];                            //когда делаем проверку на валидность сразу пишем,что возвращ.0

    }

}
