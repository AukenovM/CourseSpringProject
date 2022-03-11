package kz.iitu.itse1901.mukhamedrassul.Repository;

import kz.iitu.itse1901.mukhamedrassul.Database.Users;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class UserRepository implements UserRepo {
    private static final Log logger = LogFactory.getLog(ClothesRepository.class);
    private SessionFactory sessionFactory;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int save(Users users) {
        return 0;
    }

    @Override
    public int update(Users users) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Users> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Users us").list();
    }

    @Override
    public List<Users> findByNameAndCity(String name, String city) {
        return null;
    }

    @Override
    public Optional<Users> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String getNameById(Long id) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
