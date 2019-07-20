package br.com.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financeiro.api.model.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

}
