package spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import spring.mvc.modal.ContactForm;
@Repository
public class contactDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
   public int save(ContactForm contact) {
	   int id = (Integer)this.hibernateTemplate.save(contact);
	   return id;
   }
}
