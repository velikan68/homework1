class Main {
    public static void main(String[] args) {
        //Напишите программу, которая при запуске выводит ваше имя и фамилию на латинице.
        String name = "Nikita";
        String surname = "Boldyrev";
        System.out.println(name + " " + surname);

         /*
         Напишите программу, в которой заведены две целочисленные переменные:
         income для хранения размера доходов
         spending для хранения размера расходов
         Программа должна выводить на экран сообщение о том, сколько денег осталось на счету.
         Не считайте в уме итоговую сумму, расчёт итоговой суммы должна производить сама программа.
         Пример вывода программы
          При доходах в 44 тыс. и расходах в 30 тыс. вывод программы должен быть таким:
          Итого (руб): 14000
          */

          int income = 44000;
          int spending = 30000;
          System.out.println("Итого (руб): "+(income-spending));
    }

}


