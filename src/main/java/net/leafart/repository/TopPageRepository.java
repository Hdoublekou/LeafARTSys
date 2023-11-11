package net.leafart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.leafart.entity.BlogInfoEntity;

@Repository
public interface TopPageRepository extends JpaRepository<BlogInfoEntity,Integer> {

}
