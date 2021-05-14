package springsecurityjpa.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import springsecurityjpa.example.model.MyUserDetails;
import springsecurityjpa.example.model.User;
import springsecurityjpa.example.repository.UserRepository;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(userName);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found user" + userName));
        return user.map(MyUserDetails::new).get();
    }
}
