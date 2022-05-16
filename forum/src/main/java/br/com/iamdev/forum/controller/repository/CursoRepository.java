package br.com.iamdev.forum.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iamdev.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
