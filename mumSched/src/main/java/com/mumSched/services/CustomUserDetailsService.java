/*package com.mumSched.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.mumSched.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
    @Override
    public UserDetails loadUserByUsername(String username) {
       Optional<User> optionalUser= userRepository.getUserByUserName(username);
       optionalUser
                .orElseThrow(()-> new UsernameNotFoundException("Username Not Found"));
       return optionalUser
              .map(CustomUserPrincipal::new).get();
                 
	   
    }
   
}*/