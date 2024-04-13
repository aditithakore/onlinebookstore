package com.onlinebook.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinebook.store.entity.Publishers;

@Repository
public interface PublisherRepository extends JpaRepository<Publishers, Long> {

}
