package com.shri.spring.boot.repositories;

import com.shri.spring.boot.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: ZeeroIQ
 * @Date: 7/24/2019 12:20 AM
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
