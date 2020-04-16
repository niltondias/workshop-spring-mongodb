package br.com.finework.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.finework.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}