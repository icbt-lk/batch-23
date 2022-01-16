/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tharik
 */
@WebService(serviceName = "ICBTService")
public class ICBTService {    
    @WebMethod(operationName = "getPerson")
    public Person getPerson(@WebParam(name = "id") int id) {
        DBUtil util = new DBUtil();
        return util.getPerson(id);
    }
    
    @WebMethod(operationName = "getPersons")
    public List<Person> getPersons() {
        DBUtil util = new DBUtil();
        return util.getPersons();
    }
    
    @WebMethod(operationName = "authenticate")
    public User authenticate(@WebParam(name = "username")String username, @WebParam(name = "password") String password) {
        DBUtil util = new DBUtil();
        User user = util.getUser(username);
        
        if (user.getPassword().equals(password)) {
            return user;
        }
        return new User();
    }
}
