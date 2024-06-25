package com.ivoronline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;

@Repository
public class PersonRepository {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public void save(Person person) throws SQLException {
      jdbcTemplate.update(
          " INSERT INTO PERSON(NAME, AGE) VALUES(?, ?)"
          , new Object[] { person.getName(), person.getAge() }
      );
  }

}
