package lk.ijse.dep.web.dao;

import com.mysql.cj.Session;

import javax.persistence.EntityManager;
import java.sql.Connection;

public interface SuperDAO {
    public void setEntityManager(EntityManager entityManager) throws Exception;

}
