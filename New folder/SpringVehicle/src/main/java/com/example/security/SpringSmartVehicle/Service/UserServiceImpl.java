package com.example.security.SpringSmartVehicle.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.security.SpringSmartVehicle.Repository.UserRepo;
import com.example.security.SpringSmartVehicle.entity.User;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	
	
	private boolean checkIfdlExist(String dlno) {
		return userRepo.findByDlno(dlno)!=null?true:false;
	}


	@Override
	public void deleteUser(User user) {
		userRepo.delete(user);
	}

	@Override
	public Optional<User> getAll(int id) {
		return userRepo.findById(id);
	}



	@Override
	public int loginValidator(String dlno) {
		 if(userRepo.findByDlno(dlno)!=null){
	         return 1;
		 }
	        return 0;
	    }

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void createUser(@ModelAttribute User user) throws Exception {
		if(user.getDlno()==""){
			if(user.getPass()==""){
			throw new Exception("please enter dlno and password");
		}
		}
		else if(checkIfdlExist(user.getDlno())){
			throw new Exception("User already exists");
		}
			
			userRepo.save(user);
			}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void updateUser(User user) {
//		user.setVehicleType(user.getVehicleType());
		userRepo.save(user);
	}

//	@Override
//	public Optional<User> getAll(int id) {
//		return userRepo.findById(id);
//	}

	@Override
	public int getIdByDlno(String dlno) {
		User u=userRepo.findByDlno(dlno);
		int id=u.getId();
		return id;
	}

	@Override
	public Object getUser(int id) {
		return userRepo.findById(id);
	}


	

	
}
