package com.carshopwebapp.services;

import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.model.LoginResponse;
import com.carshopwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Owner owner = ownerRepository.findByEmail(email);


        return new LoginResponse(owner.getEmail(), owner.getKwdikoXristi(), Arrays.asList(new SimpleGrantedAuthority(owner.getTipoXristi())));


    }
}
