package fr.scriptoria.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.security.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmail(String email);

    Boolean existsByEmail(String email);

}
