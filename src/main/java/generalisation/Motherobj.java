/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generalisation;

import java.sql.Connection;

/**
 *
 * @author tsoa
 */
public class Motherobj {

    public void create(Connection connection, String primarykey)
            throws Exception {
        GenericDao<T> gnDao = new GenericDao<T>();
        gnDao.save(this, connection, primarykey);
    }
}
