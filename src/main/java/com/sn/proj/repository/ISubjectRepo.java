package com.sn.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sn.proj.model.Subject;

@Repository
public interface ISubjectRepo extends JpaRepository<Subject, String> {

}
