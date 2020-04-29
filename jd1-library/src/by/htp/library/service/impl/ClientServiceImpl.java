package by.htp.library.service.impl;

import by.htp.library.dao.ClientDAOException;
import by.htp.library.dao.ClientDao;
import by.htp.library.dao.DAOProvider;
import by.htp.library.dao.impl.FileClientDao;
import by.htp.library.service.ClientService;
import by.htp.library.service.ClientServiceException;
import by.htp.library.service.util.Validator;

public class ClientServiceImpl implements ClientService{
	// Сервисы в обязательном порядке валидируют пришедшие в них данные!!!

	@Override
	public boolean authorization(String login, String password) throws ClientServiceException {
		
		if (!Validator.isCredentialValid(login, password)) {
			throw new ClientServiceException("Incorrect login or password!");
		}
		
		DAOProvider provider = DAOProvider.getProvider();
		ClientDao clientDao = provider.getClientDao();
		boolean result;
		
		try {
			result = clientDao.authorization(login, password);
		} catch (ClientDAOException e) {
			throw new ClientServiceException(e);
		}
		
		
		return result;
	}

	@Override
	public boolean registratiion(String login, String password) throws ClientServiceException {
		// TODO Auto-generated method stub
		return false;
	}

}
