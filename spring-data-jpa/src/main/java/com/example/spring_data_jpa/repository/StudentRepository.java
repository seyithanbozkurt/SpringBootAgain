package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    //HQL : SINIFIN İSMİ VE DEĞİŞKENLERİN ADLARI İLE SORGULAR YAZILIR.
    //SQL : DB DE Kİ TABLO İSİMLERİ VE TABLO İÇİNDEKİ KOLANLAR KULLANILARAK YAZILIR.

    @Query(value = "from Student", nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from Student s Where  s.id= :studentid")
    Optional<Student> findStudentById(Integer studentid);
}
