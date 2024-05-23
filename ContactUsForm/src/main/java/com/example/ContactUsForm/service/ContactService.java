package com.example.ContactUsForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContactUsForm.model.Contact;
import com.example.ContactUsForm.repository.ContactRepository;

@Service
public class ContactService {

	private ContactRepository contactRepo;

    @Autowired
    public ContactService(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    public void saveContact(Contact contact) {
        // Additional business logic can be implemented here...
        contactRepo.save(contact);
    }
	
}
