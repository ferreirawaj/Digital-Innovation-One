package com.github.ferreirawaj.staties.repositories;

import com.github.ferreirawaj.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
