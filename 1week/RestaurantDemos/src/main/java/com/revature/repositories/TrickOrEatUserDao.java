package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class TrickOrEatUserDao implements RestaurantUserDao{
	
	private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

	public User findUserByUsernameAndPassword(String username, String password) throws UserNotFoundException, InternalErrorException {
		Connection conn = cu.getConnection();
		try {
			
			String sql = "Select * from users where username = ? and \"password\" = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				User u = new User();
				u.setUserId(res.getInt("user_id"));
				u.setName(res.getString("name"));
				u.setHunger(res.getDouble("hunger_level"));
				u.setPassword("");
				u.setUsername(res.getString("username"));
				u.setAddress(res.getString("address"));
				return u;
			}else {
				throw new UserNotFoundException();
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new InternalErrorException();
		}
	}

	public List<User> findAllusers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
