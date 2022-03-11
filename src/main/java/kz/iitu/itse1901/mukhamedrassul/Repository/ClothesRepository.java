package kz.iitu.itse1901.mukhamedrassul.Repository;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;

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
public class ClothesRepository implements ClothRepo {
    private static final Log logger = LogFactory.getLog(ClothesRepository.class);
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public int count() {
        return (int) sessionFactory.getCurrentSession().createQuery("from Clothes as cl").stream().count();
    }

    @Override
    public void save(Clothes clothes) {
        sessionFactory.getCurrentSession().saveOrUpdate(clothes);
        logger.info("Clothes saved with id: " + clothes.getClothes_id());
    }

    public void delete(Clothes clothes) {
        sessionFactory.getCurrentSession().delete(clothes);
        logger.info("Clothe deleted with id: " + clothes.getClothes_id());
    }


    @Override
    @Transactional(readOnly = true)
    public int update(Clothes clothes) {
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Clothes> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Clothes cl").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Clothes> findByNameAndMaterialType(String name, String material_type) {
        return null;
    }

    @Override
    public Optional<Clothes> findById(Long id) {
        return Optional.of(sessionFactory.getCurrentSession().get(Clothes.class,id));
    }



    @Override
    @Transactional(readOnly = true)
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


    //    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    @Override
//    public int count() {
////        namedParameterJdbcTemplate.queryForObject();
//
//        return jdbcTemplate
//                .queryForObject("select count(*) from clothes", Integer.class);
//    }
//
//    @Override
//    public int save(Clothes clothes) {
//        return jdbcTemplate.update(
//                "insert into clothes (id, name, material_type, size) values(?,?,?,?)",
//                clothes.getClothes_id(), clothes.getName(), clothes.getMaterial_type(), clothes.getSize());
//    }
//
//    @Override
//    public int update(Clothes clothes) {
//        return
//                jdbcTemplate.update(
//                "update clothes set material_type = ? where id = ?",
//                clothes.getMaterial_type(), clothes.getClothes_id());
//    }
//
//    @Override
//    public int deleteById(Long id) {
//       return jdbcTemplate.update(
//                "delete from clothes where id = ?",
//                id);
//    }
//
//    @Override
//    public List<Clothes> findAll() {
//        return jdbcTemplate.query(
//                "select * from clothes",
//                (rs, rowNum) ->
//                        new Clothes(
//                                rs.getLong("id"),
//                                rs.getString("name"),
//                                rs.getString("material_type"),
//                                rs.getString("size")
//                        )
//        );
//    }
//
//    @Override
//    public List<Clothes> findByNameAndMaterialType(String name, String material_type) {
//
//        return null;
//    }
//
//    @Override
//    public Optional<Clothes> findById(Long id) {
//
//
//
//
//
//    return  namedParameterJdbcTemplate.queryForObject("select * from clothes where id = :id",
//            new MapSqlParameterSource("id", id),
//            (rs, rowNum) ->
//                    Optional.of(new Clothes(
//                                    rs.getLong("id"),
//                                    rs.getString("name"),
//                                    rs.getString("material_type"),
//                                    rs.getString("size")
//                            )
//                    ));
//    }
//
//    @Override
//    public String getNameById(Long id) {
//        return
//                jdbcTemplate.queryForObject(
//                "select name from clothes where id = ?",
//                String.class,
//                new Object[]{id}
//
//        );
//    }
}
