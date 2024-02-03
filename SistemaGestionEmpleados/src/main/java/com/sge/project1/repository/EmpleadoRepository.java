/**
 * 
 */
package com.sge.project1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sge.project1.model.Empleado;

/**
 * 
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    
	/**
	 * @param salario
	 * @return
	 */
	List<Empleado> findBySalarioGreaterThan(double salario);

}