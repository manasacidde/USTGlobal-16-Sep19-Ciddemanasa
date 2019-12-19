package com.ustglobal.librarysystem.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

@Repository
public class AdminDAOImpl implements AdminDAO {

	
	@PersistenceUnit
	private EntityManagerFactory factory;
	//ADD LIBRARIAN
		

		//DELETE LIBRARIAN
		@Override
		public Boolean deleteLibrarian(int id) throws CustomException {
			boolean isDeleted = false;
			try {
				EntityManager manager = factory.createEntityManager();
				Users user = manager.find(Users.class, id);
				manager.getTransaction().begin();
				manager.remove(user);
				manager.getTransaction().commit();
				isDeleted = true;
				manager.close();
			} catch (Exception e) {
				throw new CustomException("Failed to Delete Librarin");
			}
			return isDeleted;
		}// end of deleteLibrarian()

		//DISPLAY LIBRARIAN
		@Override
		public List<Users> displayLibrarian() throws CustomException {
			List<Users> userList = null;
			 try {
				 EntityManager manager = factory.createEntityManager();
				TypedQuery<Users> typedQuery = manager.createQuery("from Users where type = 'librarian'", Users.class);
				 userList = typedQuery.getResultList();
			} catch (Exception e) {
				throw new CustomException("No Data Found");
			}
			return userList;
		}// end of displayLibrarian()

}
