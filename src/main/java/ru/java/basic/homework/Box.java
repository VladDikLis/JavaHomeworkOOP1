package ru.java.basic.homework;

import java.util.Objects;

public class Box {
    public String size;
    public String colour;
    public String condition;
    public String boxObject;

    public Box(String size, String colour, String condition, String boxObject) {
        this.size = size;
        this.colour = colour;
        this.condition = condition;
        this.boxObject = boxObject;
    }

    public void boxPrint() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет: " + colour);
        System.out.println("Состояние: " + condition);
        System.out.println("Внутри: " + boxObject);
        System.out.println();
    }

    public void boxOpen() {
        if (Objects.equals(condition, "Закрыта")) {
            condition = "Открыта";
            System.out.println("Вы открыли коробку");
        }
        else {
            System.out.println("Коробка уже открыта");
        }
        System.out.println();
    }

    public void boxClose() {
        if (Objects.equals(condition, "Открыта")) {
            condition = "Закрыта";
            System.out.println("Вы закрыли коробку");
        }
        else {
            System.out.println("Коробка уже закрыта");
        }
        System.out.println();
    }

    public void boxIn(String boxObject) {
        if (Objects.equals(condition, "Открыта")) {
            if (Objects.equals(this.boxObject, "Пусто")) {
                this.boxObject = boxObject;
                System.out.println("Вы положили " + boxObject + " в коробку");
            }
            else {
                System.out.println("Нельзя положить " + boxObject + " в коробку. В коробке уже лежит " + this.boxObject);
            }
        }
        else {
            System.out.println("Нельзя положить предмет в закрытую коробку");
        }
        System.out.println();
    }

    public void boxOut() {
        if (Objects.equals(condition, "Открыта")) {
            if (!Objects.equals(boxObject, "Пусто")) {
                System.out.println("Вы выложили " + boxObject + " из коробки");
                this.boxObject = "Пусто";
            }
            else {
                System.out.println("В коробке и так пусто. Нечего вытащить");
            }
        }
        else {
            System.out.println("Нельзя вытащить предмет из закрытой коробки");
        }
        System.out.println();
    }

    public void boxNewcolour(String colour) {
        this.colour = colour;
        System.out.println("Вы перекрасили коробку");
    }
}