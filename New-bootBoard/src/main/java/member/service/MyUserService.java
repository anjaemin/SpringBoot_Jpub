package member.service;

import lombok.extern.slf4j.Slf4j;
import member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.PostConstruct;

@Slf4j
public class MyUserService implements UserDetailsService {
    @Autowired
    MemberRepository memberRepository;

    private static final String Role_PREFIX = "Role_";

    @PostConstruct
    private void created() {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
