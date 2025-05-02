package org.codingwallah.emproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.codingwallah.emproject.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {

}
