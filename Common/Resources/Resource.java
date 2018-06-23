package Common.Resources;

import java.util.ListResourceBundle;

public class Resource extends ListResourceBundle {
    private static final Object[][] contents =
            {
                    {"id","ID"},
                    {"name","Имя"},
                    {"splash","Брызги"},
                    {"depth","Глубина"},
                    {"color","Цвет"},
                    {"x","Координата X"},
                    {"y","Координата Y"},
                    {"add","Добавить элемент"},
                    {"remove","Удалить элемент"},
                    {"removeLower","Удалить с ключом меньше"},
                    {"control","Управление"},
                    {"import","Импорт"},
                    {"save","Сохранить"},
                    {"connections","Подключения"},
                    {"ip","IP адресс"},
                    {"port","Порт"},
                    {"ban","Бан"},
                    {"client","Клиент"},
                    {"server","Сервер"},
                    {"minX","Минимальный X"},
                    {"maxX","Максимальный X"},
                    {"minY","Минимальный Y"},
                    {"maxY","Максимальный Y"},
                    {"minSplash","Мин. брызги"},
                    {"maxSplash","Макс. брызги"},
                    {"minDepth","Мин. глубина"},
                    {"maxDepth","Макс. глубина"},
                    {"orange","Оранжевый"},
                    {"blue","Синий"},
                    {"red","Красный"},
                    {"yellow","Желтый"},
                    {"start","Старт"},
                    {"stop","Стоп"},
                    {"update","Обновить"},
                    {"keyExists","Элемент с таким ключем уже существует"},
                    {"added","Элемент успешно добавлен"},
                    {"checkData","Ошибка добавления обьекта. Проверьте вводимые данные"},
                    {"imported","Коллекция успешно импортирована"},
                    {"fileNotFound","Файл не найден"},
                    {"removedOne","Элемент успешно удален"},
                    {"noSuchKey","В коллекции нет элемента с таким ключем"},
                    {"wrongFormat","Неверный формат ключа"},
                    {"removedMany","Элементы успешно удалены"},
                    {"noKeyLess","В коллекции нет элементов, с ключом, меньше введенного"},
                    {"saved","Коллекция успешно сохранена"},
                    {"enterPath","Введите путь к файлу импорта:"},
                    {"noColor","Не выбран цвет"},
                    {"error","Ошибка"},
                    {"noFilteredObjects","Нет объектов, удовлетворяющих фильтрам."},
                    {"message", "Сообщение"},
                    {"youUnbanned", "Вы были разбанены"},
                    {"youBanned", "Вы были забанены"},
                    {"language","Язык"},
                    {"",""},
                    {"",""},
                    {"",""},
                    {"",""},


            };

    @Override
    public Object[][] getContents() {
        return contents;
    }
}
