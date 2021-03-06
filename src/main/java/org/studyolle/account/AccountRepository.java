package org.studyolle.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.studyolle.domain.Account;

@Transactional(readOnly = true)
public interface AccountRepository extends JpaRepository<Account, Long> {
    boolean existsByEmail(String email);

    boolean existsByNickName(String nickname);

    Account findByEmail(String email);

    Account findByNickName(String nickname);
}
