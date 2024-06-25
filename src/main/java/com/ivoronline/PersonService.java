package com.ivoronline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.sql.DataSource;

@Service
public class PersonService {

  //PROPERTIES
  @Autowired private PersonRepository personRepository;
  @Autowired private DataSource       dataSource;

  //=========================================================================================================
  // INSERT RECORDS
  //=========================================================================================================
  @Transactional
  public void insertRecords() throws Exception {
    for (int age = 1; age <= 2; age++) {
        if(age==2) { throw new RuntimeException("Exception"); }
        personRepository.save(new Person(0, "John", age));
    }
  }

}
