package by.htp.homework.basic_of_oop.task1;

public class Main {

	public static void main(String[] str) {

		// Создать объект Текстовый файл, используя классы Файл, Директория. Методы:
		// создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
		
		Directory myDocument;
		
		myDocument = new Directory("Мои докуметы");
		
		myDocument.addDirectory(new Directory("novels"));
		myDocument.addDirectory(new Directory("my work"));
		myDocument.addFile(new TextFile("notes"));
		myDocument.addFile(new TextFile("Java book"));
		myDocument.addFile(new TextFile("Hellow World"));
		
		myDocument.rename("Чужие документы");
		myDocument.removeFile("notes");
		myDocument.removeDirectory("novels");
		
		
		View.printDirectory(myDocument);
		
		
		
		}
	

}
