# Домашнее задание по теме «Внедрение системы контроля версий»

## Инструмент: Анализ статистики продаж

### Данный инструмент анализирует продажи и показывает самую большую из них.

#### Основа интрумента:
* *Массив интов, куда будут добавляться суммы продаж.*

``` 
public class SalesManager {
protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }
```
* *Далее метод поиска наибольшей суммы*
```
public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```



#### Реализация инструмента:

1. В классе Main новый интрумент продаж и поместите в него суммы.
```
SalesManager salesManager = new SalesManager(new int[]{сумма, сумма...});
```
2. Вызовите метод max из SalesManager.
```
salesManager.max();
```
*Метод проанализирует ваши суммы и выдаст вам наибольшую.*

### Пример реализации интрумента
```
SalesManager salesManager = new SalesManager(new int[]{200, 300, 500});

        System.out.println(salesManager.max());
```
Результат: ```500```

