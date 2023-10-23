// Задание

// Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков Set<Laptop>. (добиться чтобы во множестве не было одинаковых ноутбуков)
// (*) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
//     ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
//     необходимому критерию:
//      1 - ОЗУ

//      2 - Объем ЖД

//      3 - Операционная система

//      4 - Цвет …

//     Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
//     также в Map.
//     Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

        package src.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class taskLaptop {
    String name;
    String operatingSystem;
    String caseColor;
    double ram;
    double hardDriveCapacity;


    public taskLaptop(String name, String operatingSystem, String caseColor, double ram, double hardDriveCapacity) {
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.caseColor = caseColor;
        this.ram = ram;
        this.hardDriveCapacity = hardDriveCapacity;
    }
    public String toString() {
        return String.format(name + ", " + caseColor + "," + "  ОЗУ " + ram + ",  Емкость диска " + hardDriveCapacity);
    }
    public int hashCode() {
        return (int) (this.name.hashCode() + this.operatingSystem.hashCode() + this.caseColor.hashCode() + this.ram + this.hardDriveCapacity);
    }
    public boolean equals(Object o) {
        if (o == null)
            return false;
        return o.hashCode() == this.hashCode();
    }
    public static void main(String[] args) {
        taskLaptop laptop1 = new taskLaptop("Lenovo X260/270", "Android", "white", 8, 1);
        taskLaptop laptop2 = new taskLaptop("Lenovo X240/250", "Android", "black", 16, 2);
        taskLaptop laptop3 = new taskLaptop("Samsung Galaxy Book15", "Android", "rad", 16, 2);
        taskLaptop laptop4 = new taskLaptop("Kongkay", "Android", "silver", 8, 3);
        taskLaptop laptop5 = new taskLaptop("Samsung Galaxy Book3 Pro 16", "Android", "white", 16, 4);
        taskLaptop laptop6 = new taskLaptop("Samsung Galaxy Book3 Pro 16", "Android", "white", 16, 4);
        Set<taskLaptop> data = new HashSet<>(List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));

        System.out.println(data);
    }
}