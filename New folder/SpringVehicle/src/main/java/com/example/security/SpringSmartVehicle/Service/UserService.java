package com.example.security.SpringSmartVehicle.Service;


import java.util.List;
import java.util.Optional;

import com.example.security.SpringSmartVehicle.entity.User;

public interface UserService {

	public void createUser(User user) throws Exception ;

	public void deleteUser(User user) ;



	public int loginValidator(String dlno);

	

	



	public void updateUser(User user);

	public Optional<User> getAll(int id);

	public int getIdByDlno(String dlno);

	public Object getUser(int id);


	
}