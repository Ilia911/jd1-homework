package by.htp.homework.pattern_matcher.task_two;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Дана строка, содержащая текст (xml-документ).
		// Написать анализатор, позволяющий последовательно возвращать содержимое узлов
		// xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
		// тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
		// запрещено.

		// Столько много новых слов в описании задачи... Прямо неизвестно с какой
		// стороны подступать( Отправляюсь учить матчасть

		String str;

		ArrayList<TagAndType> list = new ArrayList<TagAndType>();

		str = "<notes>" + "<note id = \"1\">" + "<to>Vasia</to>" + "<from>Sveta</from>" + "<heading>Reminder</heading>"
				+ "<body>Call me tomerrow!</body>" + "</note>" + "<note id = \"2\">" + "<to>Piter</to>"
				+ "<from>Masha</from>" + "<heading>Important reminder</heading>" + "<body/>" + "</note>" + "</notes>";

		list = TagAndTypeLogic.tagAndType(str);
		View.print(list);

	}

}
