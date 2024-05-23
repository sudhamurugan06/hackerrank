package com.example.ContactUsForm.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ContactUsForm.model.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long>
{
}
