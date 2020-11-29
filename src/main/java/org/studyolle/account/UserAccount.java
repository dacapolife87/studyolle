package org.studyolle.account;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.studyolle.domain.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Getter
public class UserAccount extends User {

    private Account account;

    public UserAccount(Account account) {
        super(account.getNickName(),account.getPassword(),null);
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>(Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
//        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        super(account.getNickName(), account.getPassword(), authorities);
        this.account = account;
    }



}
