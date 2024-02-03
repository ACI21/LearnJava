/**
 * 
 */
package com.sge.project1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sge.project1.model.Empleado;
import com.sge.project1.repository.EmpleadoRepository;

/**
 * 
 */
@RestController
public class EmpleadoController {
	
	@Autowired
    private EmpleadoRepository empleadoRepository;
	
	@GetMapping("/empleados")
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }
	
	@GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
		
	@PostMapping("/empleados")
	public ResponseEntity<Empleado> crearEmpleado(@RequestBody Empleado nuevoEmpleado){
		Empleado empleadoGuardado = empleadoRepository.save(nuevoEmpleado);
		return ResponseEntity.ok(empleadoGuardado);
	}
	
	@PutMapping("/empleados/{id}")
	public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoActualizado){
		Optional<Empleado> empleadoExistente = empleadoRepository.findById(id);

        if (empleadoExistente.isPresent()) {
            Empleado empleado = empleadoExistente.get();
            empleado.setNombre(empleadoActualizado.getNombre());
            empleado.setSalario(empleadoActualizado.getSalario());

            Empleado empleadoActualizadoGuardado = empleadoRepository.save(empleado);
            return ResponseEntity.ok(empleadoActualizadoGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
	}
	
	@DeleteMapping("/empleados/{id}")
	public ResponseEntity<Empleado> borrarEmpleado(@PathVariable Long id){
        if (empleadoRepository.existsById(id)) {
            empleadoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
	}
	
	
}