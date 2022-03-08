
package com.hibernate.hibernate.service;

import com.hibernate.hibernate.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository persoRepository;
}
