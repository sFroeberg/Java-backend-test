package com.example.javabackend.repository;

import com.example.javabackend.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // ========== INHERITED METHODS FROM JpaRepository/CrudRepository ==========
    // These methods are automatically provided by Spring Data JPA
    // Making them explicit for clarity
    
    /**
     * Retrieves an entity by its id.
     * @param id must not be null
     * @return the entity with the given id or Optional#empty() if none found
     */
    @Override
    Optional<User> findById(Long id);
    
    /**
     * Returns all instances of the type.
     * @return all entities
     */
    @Override
    List<User> findAll();
    
    /**
     * Returns all entities sorted by the given options.
     * @param sort the Sort specification to sort the results by
     * @return all entities sorted by the given options
     */
    @Override
    List<User> findAll(Sort sort);
    
    /**
     * Returns a Page of entities meeting the paging restriction provided in the Pageable object.
     * @param pageable the pageable to request a paged result
     * @return a page of entities
     */
    @Override
    Page<User> findAll(Pageable pageable);
    
    /**
     * Saves a given entity.
     * @param entity must not be null
     * @return the saved entity; will never be null
     */
    @Override
    <S extends User> S save(S entity);
    
    /**
     * Saves all given entities.
     * @param entities must not be null nor must it contain null
     * @return the saved entities; will never be null
     */
    @Override
    <S extends User> List<S> saveAll(Iterable<S> entities);
    
    /**
     * Saves an entity and flushes changes instantly.
     * @param entity entity to be saved
     * @return the saved entity
     */
    @Override
    <S extends User> S saveAndFlush(S entity);
    
    /**
     * Flushes all pending changes to the database.
     */
    @Override
    void flush();
    
    /**
     * Returns whether an entity with the given id exists.
     * @param id must not be null
     * @return true if an entity with the given id exists, false otherwise
     */
    @Override
    boolean existsById(Long id);
    
    /**
     * Returns the number of entities available.
     * @return the number of entities
     */
    @Override
    long count();
    
    /**
     * Deletes the entity with the given id.
     * @param id must not be null
     */
    @Override
    void deleteById(Long id);
    
    /**
     * Deletes a given entity.
     * @param entity must not be null
     */
    @Override
    void delete(User entity);
    
    /**
     * Deletes all instances of the type T with the given IDs.
     * @param ids must not be null
     */
    @Override
    void deleteAllById(Iterable<? extends Long> ids);
    
    /**
     * Deletes the given entities.
     * @param entities must not be null
     */
    @Override
    void deleteAll(Iterable<? extends User> entities);
    
    /**
     * Deletes all entities managed by the repository.
     */
    @Override
    void deleteAll();
    
    /**
     * Deletes all entities in a batch call.
     */
    @Override
    void deleteAllInBatch();
    
    /**
     * Deletes the entities identified by the given ids using a single query.
     * @param ids the ids of the entities to be deleted
     */
    @Override
    void deleteAllByIdInBatch(Iterable<Long> ids);
    
    /**
     * Returns a reference to the entity with the given identifier.
     * @param id must not be null
     * @return a reference to the entity with the given identifier
     */
    @Override
    User getReferenceById(Long id);
    
    // ========== CUSTOM METHODS ==========
    // These are custom query methods specific to User entity
    
    /**
     * Finds a user by email address.
     * @param email the email to search for
     * @return Optional containing the user if found, empty otherwise
     */
    Optional<User> findByEmail(String email);
    
    /**
     * Checks if a user exists with the given email.
     * @param email the email to check
     * @return true if user exists with this email, false otherwise
     */
    boolean existsByEmail(String email);
}
