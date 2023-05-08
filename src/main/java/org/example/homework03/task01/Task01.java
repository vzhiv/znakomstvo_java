package org.example.homework03.task01;

/*
Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го
сорта среди товаров, название которых содержит «высший».
 */

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<Goods> goods = getGoods();
        double maxCost = 0;
        int pos = 0;
        for (int i = 0; i < goods.size(); i++) {
            if ((goods.get(i).nameGoods.contains("высший")) && (goods.get(i).sort.equals("первый") || goods.get(i).sort.equals("второй"))) {
                if (maxCost < goods.get(i).cost) {
                    maxCost = goods.get(i).cost;
                    pos = i;
                }
            }
        }
        System.out.println("Товар: " + goods.get(pos).nameGoods + "; Стоимость: " + maxCost);

    }

    public static ArrayList<Goods> getGoods() {
        ArrayList<Goods> goods = new ArrayList<Goods>();
        goods.add(new Goods("высший рис", 12.32, "первый"));
        goods.add(new Goods("рис", 32.12, "второй"));
        goods.add(new Goods("высший сахар", 46.89, "третий"));
        goods.add(new Goods("фрукт", 78.10, "первый"));
        goods.add(new Goods("высший фрукт", 11.36, "первый"));
        goods.add(new Goods("сахар", 17.12, "второй"));
        goods.add(new Goods("высший овощь", 27.07, "третий"));
        goods.add(new Goods("овощь", 43.06, "второй"));
        goods.add(new Goods("высший медведь", 19.06, "второй"));
        goods.add(new Goods("медведь", 39.06, "третий"));

        return goods;
    }

}
