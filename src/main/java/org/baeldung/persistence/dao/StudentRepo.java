package org.baeldung.persistence.dao;

import org.baeldung.persistence.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
