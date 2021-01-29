package lk.ijse.dep.web.dao.custom.impl;

import lk.ijse.dep.web.dao.CrudDAOImpl;
import lk.ijse.dep.web.dao.CrudUtil;
import lk.ijse.dep.web.dao.custom.OrderDAO;
import lk.ijse.dep.web.entity.Customer;
import lk.ijse.dep.web.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl  extends CrudDAOImpl<Order, String>  implements OrderDAO {

}
