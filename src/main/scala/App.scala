import scala.io.StdIn.readLine

object App {
  def main(args: Array[String]): Unit = {
    println("2.2. Программирование Scala")
//    task_a()
//    task_b()
//    task_c()
//    task_d()
//    task_e()
    task_f()
//    task_g()
//    task_h()
  }

  def task_a(){
    println("Task A")
    // a.    Напишите программу, которая:
    var message = "Hello, Scala!"
    // выводит фразу «Hello, Scala!» справа налево
    println(message.reverse)
    // переводит всю фразу в нижний регистр
    println(message.toLowerCase())
    //  удаляет символ!
    println(message.replace("!",""))
    // добавляет в конец фразы «and goodbye python!»
    println(message + " " + "and goodbye python!")
  }
  def task_b(): Unit ={
    println("Task B")
    // b. Напишите программу, которая вычисляет ежемесячный оклад сотрудника после вычета налогов. На вход вашей программе подается значение годового дохода до вычета налогов, размер премии – в процентах от годового дохода и компенсация питания.
    println("Введите годовой доход: ")
    val annual_income = readLine().toInt
    println("Введите премию: ")
    val premium_amount = readLine().toFloat
    println("Введите компенсацию на питание: ")
    val nutritional_compensation = readLine().toInt
    var tax = 13.0
    var monthly_salary_before_tax = annual_income + annual_income*(premium_amount/100) + nutritional_compensation
    println("Зарплата до вычета налогов - " + monthly_salary_before_tax)
    val monthly_salary = monthly_salary_before_tax - monthly_salary_before_tax*(tax/100)
    println("Зарплата " + monthly_salary)
  }
  def task_c(): Unit ={
    println("Task C")
    //  Напишите программу, которая рассчитывает для каждого сотрудника отклонение(в процентах) от среднего значения оклада на уровень всего отдела. В итоговом значении должно учитываться в большую или меньшую сторону отклоняется размер оклада. На вход вышей программе подаются все значения, аналогичные предыдущей программе, а также список со значениями окладов сотрудников отдела 100, 150, 200, 80, 120, 75.
    //также список со значениями окладов сотрудников отдела 100, 150, 200, 80, 120, 75.
    val staff_salary = List(100, 150, 200, 80, 120, 75)
    val total_staff_salary = staff_salary.sum
    val staff_count = staff_salary.size
    val average_salary:Float = total_staff_salary / staff_count
    println(average_salary)
    println("Введите годовой доход: ")
    val annual_income = scala.io.StdIn.readFloat()
    println("Введите премию: ")
    val premium_amount = scala.io.StdIn.readFloat()
    println("Введите компенсацию на питание: ")
    val nutritional_compensation = scala.io.StdIn.readFloat()
    val tax = 13.0
    var monthly_salary_before_tax = annual_income + annual_income * (premium_amount / 100) + nutritional_compensation
    println("Зарплата до вычета налогов - " + monthly_salary_before_tax)
    println("Отклонение от средней")
    val deviation = 100 - (monthly_salary_before_tax*100) / average_salary
    if (deviation >= 0){
      println("+" + deviation.toString+ " %")
    } else{
      println(deviation.toString + " %")
    }

  }
  def task_d(): Unit ={
    println("Task D")
    // Попробуйте рассчитать новую зарплату сотрудника, добавив(или отняв, если сотрудник плохо себя вел) необходимую сумму с учетом результатов прошлого задания. Добавьте его зарплату в список и вычислите значение самой высокой зарплаты и самой низкой.
    var staff_salary: List[Int] = List(100, 150, 200, 80, 120, 75)
    var new_salary = readLine().toInt
    staff_salary.++=(List(new_salary))
    println("Самая выскоая зарплата: " + staff_salary.max.toString)
    println("Самая низкая зарплата: " + staff_salary.min.toString)

  }
  def task_e(): Unit = {
    println("Task E")
    // e. Также в вашу команду пришли два специалиста с окладами 350 и 90 тысяч рублей. Попробуйте отсортировать список сотрудников по уровню оклада от меньшего к большему.
    var staff_salary: List[Int] = List(100, 150, 200, 80, 120, 75)
    var new_salary1 = 360
    var new_salary2 = 90
    staff_salary.++=(List(new_salary1, new_salary2))
    println(staff_salary.sorted)
  }
  def task_f(): Unit = {
    println("Task F")
    // f.     Кажется, вы взяли в вашу команду еще одного сотрудника и предложили ему оклад 130 тысяч. Вычислите самостоятельно номер сотрудника в списке так, чтобы сортировка не нарушилась и добавьте его на это место.
    var staff_salary: List[Int] = List(100, 150, 200, 80, 120, 75)
    staff_salary = staff_salary.sorted
    var new_salary = 130
    println(staff_salary)

  }
  def task_g(): Unit = {

  }
  def task_h(): Unit = {

  }
}
//codewars.com