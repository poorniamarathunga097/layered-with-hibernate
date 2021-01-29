package lk.ijse.dep.web.dao.custom.impl;

import lk.ijse.dep.web.dao.CrudDAOImpl;
import lk.ijse.dep.web.dao.CrudUtil;
import lk.ijse.dep.web.dao.custom.ItemDAO;
import lk.ijse.dep.web.entity.Customer;
import lk.ijse.dep.web.entity.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl  extends CrudDAOImpl<Item, String>  implements ItemDAO {

}
