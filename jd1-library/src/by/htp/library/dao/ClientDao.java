package by.htp.library.dao;

import by.htp.library.bean.NewUserInfo;

public interface ClientDao {
	boolean authorization(String login, String password) throws ClientDAOException;	
	boolean registration(NewUserInfo newUser) throws ClientDAOException;

}
