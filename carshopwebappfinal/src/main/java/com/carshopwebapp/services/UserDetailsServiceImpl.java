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
        // here we would search into the repo for the user.
        // for not we are just going to send always a successful response.
        Owner owner = ownerRepository.findByEmail(email);

/*        List<SimpleGrantedAuthority> authorization = Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
        CharSequence password = "password";*/

        return new LoginResponse(owner.getEmail(), owner.getKwdikoXristi(), Arrays.asList(new SimpleGrantedAuthority(owner.getTipoXristi())));


    }
}
