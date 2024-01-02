package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.contactDao;
import spring.mvc.modal.ContactForm;
@Service
public class ContactService {
	@Autowired
	private contactDao dao;
	public int createContact(ContactForm form) {
		
		return this.dao.save(form);
	}
}
