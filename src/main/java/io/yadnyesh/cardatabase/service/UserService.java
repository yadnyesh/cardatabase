package io.yadnyesh.cardatabase.service;

import io.yadnyesh.cardatabase.model.User;
import io.yadnyesh.cardatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User currentUser = userRepository.findByUserName(userName);

        return new org.springframework.security.core.userdetails
                .User(userName, currentUser.getPassword(), true, true
                , true,true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
    }

}
