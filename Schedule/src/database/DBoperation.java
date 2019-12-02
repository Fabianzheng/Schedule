package database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import schedule.model.ChooseWork;
import schedule.model.DayOff;
import schedule.model.Friday;
import schedule.model.Monday;
import schedule.model.Person;
import schedule.model.Saturday;
import schedule.model.Sunday;
import schedule.model.Thursday;
import schedule.model.Tuesday;
import schedule.model.Wednesday;
import schedule.view.Login1Controller;

public class DBoperation extends Login1Controller {


/*
 * Add record to address book ...
 */
public static Statement scheduleAddRecordPerson(DBConnection database, Person temp) throws SQLException  {
        Connection connection = database.getConnection();
        Statement statement = connection.createStatement();      
       
        String add_command = "insert into admin (Username, dbAdminPassword, firstName, lastName, address, email, phoneNumber) VALUES ('" + temp.getUsername() + "', '" + temp.getdbAdminPassword() + "', '" + temp.getFirstName() +"', '" + temp.getLastName() +"', '" + temp.getAddress() + "', '"+  temp.getEmail()+ "', " + temp.getPhoneNumber()+ " );";
        statement.executeUpdate(add_command);
        return statement;
    }



public static Statement workAddPerson(DBConnection database, ChooseWork temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into ChooseWork (name, monday, tuesday, wednesday, thursday, friday, saturday, sunday) VALUES ('" + userName + "', '" + temp.getMonday() + "', '" + temp.getTuesday() + "', '" + temp.getWednesday() +"', '" + temp.getThursday() +"', '" + temp.getFriday() + "', '"+  temp.getSaturday()+ "','"+ temp.getSunday()+ "' );";
    statement.executeUpdate(add_command);
    return statement;
}

public static Statement RequestOff(DBConnection database, DayOff temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into RequestDayOff (firstName, DaysOff, reason) VALUES ('" + userName + "', '" + temp.getDaysOff() + "', '" + temp.getreason() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}




public static Statement addMonday(DBConnection database, Monday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Monday (Employee) VALUES ('" + temp.getEmployee() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addTuesday(DBConnection database, Tuesday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Tuesday (Employee1) VALUES ('" + temp.getEmployee1() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addWednesday(DBConnection database, Wednesday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Wednesday (Employee2) VALUES ('" + temp.getEmployee2() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addThursday(DBConnection database, Thursday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Thursday (Employee3) VALUES ('" + temp.getEmployee3() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addFriday(DBConnection database, Friday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Friday (Employee4) VALUES ('" + temp.getEmployee4() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addSaturday(DBConnection database, Saturday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Saturday (Employee5) VALUES ('" + temp.getEmployee5() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
public static Statement addSunday(DBConnection database, Sunday temp) throws SQLException  {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();      
   
    String add_command = "insert into Sunday (Employee6) VALUES ('" + temp.getEmployee6() + "' );";
    statement.executeUpdate(add_command);
    return statement;
}
/**

 * delete record from address book ...

 */

public static Statement deleteMonday(DBConnection database, Connection connection, Monday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Monday where Employee = ('"+ temp.getEmployee() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteTuesday(DBConnection database, Connection connection, Tuesday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Tuesday where Employee1 = ('" + temp.getEmployee1() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteWednesday(DBConnection database, Connection connection, Wednesday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Wednesday where Employee2 = ('" + temp.getEmployee2() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteThursday(DBConnection database, Connection connection, Thursday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Thursday where Employee3 = ('" + temp.getEmployee3() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteFriday(DBConnection database, Connection connection, Friday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Friday where Employee4 = ('" + temp.getEmployee4() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteSaturday(DBConnection database, Connection connection, Saturday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Saturday where Employee5 = ('" + temp.getEmployee5() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement deleteSunday(DBConnection database, Connection connection, Sunday temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Sunday where Employee6 = ('" + temp.getEmployee6() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
public static Statement clearRequest(DBConnection database, Connection connection, DayOff temp) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from RequestDayOff where firstName = ('" + temp.getfirstName() + "' );";

    statement.executeUpdate(del_command);

    return statement;

}
/*public static Statement addDates(DBConnection database, Person temp) throws SQLException {
    Connection connection = database.getConnection();
    Statement statement = connection.createStatement();   
    
   
    String add_command = "insert into Workday (Username, availableWorkday) VALUES ('" +
    //temp.getUsername() + "', '" + temp.getAvaliableWorkday();
    //statement.executeUpdate(add_command);
  //  return statement;
}*/

public static Statement resetWeek(DBConnection database, Connection connection) throws SQLException {

    connection = database.getConnection();

    Statement statement = connection.createStatement();       

    

    String del_command = "delete from Sunday;";
    statement.executeUpdate(del_command);
   String del_command1 = "delete from Saturday;";
    statement.executeUpdate(del_command1);
   String del_command2 = "delete from ChooseWork;";
    statement.executeUpdate(del_command2);
    String del_command3 = "delete from Monday;";
    statement.executeUpdate(del_command3);
    String del_command4 = "delete from Tuesday;";
    statement.executeUpdate(del_command4);
    String del_command5 = "delete from Wednesday;";
    statement.executeUpdate(del_command5);
    String del_command6 = "delete from Thursday;";
    statement.executeUpdate(del_command6);
    String del_command7 = "delete from Friday;";
    statement.executeUpdate(del_command7);
    return statement;

}
/*

* Update address book ...

*/

public static Statement addressBookUpdate(DBConnection database, Person temp) throws SQLException {

Connection connection = database.getConnection();

Statement statement = connection.createStatement();





String update_command = "update admin set address" + " = '" + temp.getAddress() + "'," + "email" + " = '" + temp.getEmail() +  "'" + ", phoneNumber = '" + temp.getPhoneNumber() +"'" + " where Username = '" + userName + "';";

       

statement.executeUpdate(update_command);

return statement;

}



}

