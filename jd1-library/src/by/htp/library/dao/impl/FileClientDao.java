package by.htp.library.dao.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.htp.library.bean.NewUserInfo;
import by.htp.library.dao.ClientDAOException;
import by.htp.library.dao.ClientDao;


public class FileClientDao implements ClientDao {
	
	
	

	private static final String USER_SOURSE = "resources/users.txt"; // Возможно ее потом надо будет вынести в отедльный
																		// класс, где будут хранится константы (это если
																		// надо будет использовать эту константу в
																		// нескольких классах)

	@Override
	public boolean authorization(String login, String password) throws ClientDAOException{
		// Вроде как здесь надо в блоке finally закрыть reader (да даже обязательно). разобраться
		
		FileReader reader;

		try {
			reader = new FileReader(USER_SOURSE);
		} catch (FileNotFoundException e) {
			throw new ClientDAOException(e);
		} 
		return true;// это для заглушки. дописать метод
	}

	@Override
	public boolean registration(NewUserInfo newUser) throws ClientDAOException{
		// TODO Auto-generated method stub
		return false;
	}

}
