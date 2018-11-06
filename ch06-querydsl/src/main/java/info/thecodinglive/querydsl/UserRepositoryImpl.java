package info.thecodinglive.querydsl;

import com.querydsl.jpa.JPQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import javax.persistence.EntityManager;
import java.util.List;

public class UserRepositoryImpl extends QueryDslRepositorySupport implements UserRepositoryCustom {
    public UserRepositoryImpl() {
        super(UserEntity.class);
    }

    @Override
    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }



    @Override
    public List findAllLike(String keyword) {
        QUserEntity qUserEntity = QUserEntity.userEntity;
        JPQLQuery<UserEntity> query = from(qUserEntity);
        List<UserEntity> resultList = query.where(qUserEntity.userName.like(keyword)).fetch();

        return resultList;
    }

    @Override
    public int maxAge() {
        QUserEntity qUserEntity = QUserEntity.userEntity;
        return from(qUserEntity).select(qUserEntity.age.max()).fetchOne();
    }

    @Override
    public int minAge() {
        QUserEntity qUserEntity = QUserEntity.userEntity;
        return from(qUserEntity).select(qUserEntity.age.min()).fetchOne();
    }
}
